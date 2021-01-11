package com.ym.jooqtest.service.impl;

import com.ym.jooqtest.generated.Tables;
import com.ym.jooqtest.generated.tables.pojos.UserInfo;
import com.ym.jooqtest.generated.tables.records.UserInfoRecord;
import com.ym.jooqtest.service.UserInfoService;
import org.jetbrains.annotations.NotNull;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectJoinStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ymaster1
 * @Date 2020/12/24 10:43
 * @Description:
 */
@Service
public class
UserInfoServiceImpl implements UserInfoService {
    @Autowired
    DSLContext dslContext;

    @Override
    public List<UserInfo> getAll() {

        SelectJoinStep<Record> from = dslContext
                .select()
                .from(Tables.USER_INFO);
        /**
         * fetch（）方法可以返回一个结果集对象Result,他实现了List接口
         */
        Result<Record> fetch = from.fetch();

        List<UserInfo> list1 = getListByRecord(fetch);
        List<UserInfo> list2 = getListByTableRecord(fetch);

        /**
         * 单表情况下，这个是最方便的，不需要依次设置，自动进行BeanConvert
         */
        List<UserInfo> list3 = getListByAnyRecord(from);
        return list3;
    }

    @Override
    public UserInfo getById(Long id) {
        Record record = dslContext.select().from(Tables.USER_INFO).where(Tables.USER_INFO.ID.eq(id)).fetchOne();
//        可以将结果集转化为map
        Map<String, Object> stringObjectMap = dslContext.select().from(Tables.USER_INFO).where(Tables.USER_INFO.ID.eq(id)).fetchOneMap();

        UserInfo into = record.into(UserInfo.class);
//        或者直接一步，使用fetchOneInto
        UserInfo info = dslContext.select().from(Tables.USER_INFO).where(Tables.USER_INFO.ID.eq(id)).fetchOneInto(UserInfo.class);
        return info;
    }

    /**
     * 直接通过Result<Record>获取值，需要在每次获取的时候指定表名称和字段名
     *
     * @param fetch
     * @return
     */
    private List<UserInfo> getListByRecord(Result<Record> fetch) {
        List<UserInfo> list = new ArrayList<>();
        fetch.forEach(e -> {
            UserInfo info = new UserInfo();
//            通过表中的字段名称获取对应的值
            String name = e.get(Tables.USER_INFO.USER_NAME);
            info.setUserName(name);

            info.setAdder(e.get(Tables.USER_INFO.ADDER));
            info.setUserId(e.get(Tables.USER_INFO.USER_ID));
            info.setCity(e.get(Tables.USER_INFO.CITY));
            info.setId(e.get(Tables.USER_INFO.ID));
            info.setConcatPhone(e.get(Tables.USER_INFO.CONCAT_PHONE));
            info.setCountry(e.get(Tables.USER_INFO.COUNTRY));
//            可以直接into更快
//            UserInfo into = e.into(UserInfo.class);

            list.add(info);
        });

        return list;
    }

    /**
     * Result 的into方法可以将默认的Record转换为更精确的表Record
     * 通过Result<UserInfoRecord> 获取值，不需要多次指定表名
     * <p>
     * Record 也有into方法，是一样的，不过没必要
     * UserInfoRecord into = e.into(Tables.USER_INFO);
     *
     * @param fetch
     */
    private List<UserInfo> getListByTableRecord(Result<Record> fetch) {
        List<UserInfo> list = new ArrayList<>();
        Result<UserInfoRecord> into = fetch.into(Tables.USER_INFO);
        into.forEach(e -> {
//           可以直接转化为map
            System.out.println(e.intoMap());
            UserInfo info = new UserInfo();
            info.setUserName(e.getUserName());

            info.setAdder(e.getAdder());
            info.setUserId(e.getUserId());
            info.setCity(e.getCity());
            info.setId(e.getId());
            info.setConcatPhone(e.getConcatPhone());
            info.setCountry(e.getCountry());
            list.add(info);
        });
        return list;
    }

    /**
     * fetchInto方法可以可以传入任意class类型，或者表常量
     * 会直接返回任意class类型的List集合，或者指定表Record的结果集对象
     *
     * @param from
     * @return
     */
    private List<UserInfo> getListByAnyRecord(SelectJoinStep<Record> from) {
//        返回指定表的Record结果集对象
        Result<UserInfoRecord> userInfoRecords = from.fetchInto(Tables.USER_INFO);
//        返回指定类型的List
        List<UserInfoRecord> userInfoRecords1 = from.fetchInto(UserInfoRecord.class);
//        返回指定类型list
        List<UserInfo> list = from.fetchInto(UserInfo.class);
//        可以直接转化为map
        List<Map<String, Object>> maps = from.fetchMaps();
        return list;

    }

    @Override
    public void create(UserInfo userInfo) {
        if (userInfo == null) {
            return;
        }
//        insertBySql(userInfo.getUserName(), userInfo.getUserId(), userInfo.getSex(), userInfo.getConcatPhone(), userInfo.getStatusFlag());
//        insertByApi(userInfo.getUserName(), userInfo.getUserId(), userInfo.getSex(), userInfo.getConcatPhone(), userInfo.getStatusFlag());
//        insertByRecord(userInfo.getUserName(), userInfo.getUserId(), userInfo.getSex(), userInfo.getConcatPhone(), userInfo.getStatusFlag());
        insertByRecordAndGetId(userInfo.getUserName(), userInfo.getUserId(), userInfo.getSex(), userInfo.getConcatPhone(), userInfo.getStatusFlag());
    }

    /**
     * 通过类sql写法单表插入
     * 第一个参数时表常量，后面是字段
     * 可以批量插入
     *
     * @return
     */
    private void insertBySql(String name, String userId, Byte sex, String concatPhone, Byte statusFlag) {
        int execute = dslContext.insertInto(Tables.USER_INFO,
                Tables.USER_INFO.USER_NAME,
                Tables.USER_INFO.USER_ID,
                Tables.USER_INFO.SEX,
                Tables.USER_INFO.CONCAT_PHONE,
                Tables.USER_INFO.STATUS_FLAG)
                .values(name, userId, sex, concatPhone, statusFlag)
//                可以批量插入
                .values(name + "sql", userId + "sql", sex, concatPhone + "sql", statusFlag)
//                返回执行成功数量
                .execute();
        System.out.println("成功插入：" + execute + "条数据！");

    }

    /**
     * 通过Record记录，也支持批量插入
     *
     * @param name
     * @param userId
     * @param sex
     * @param concatPhone
     * @param statusFlag
     */
    private void insertByRecord(String name, String userId, Byte sex, String concatPhone, Byte statusFlag) {
        int execute = dslContext.insertInto(Tables.USER_INFO)
                .set(Tables.USER_INFO.USER_NAME, name)
                .set(Tables.USER_INFO.USER_ID, userId)
                .set(Tables.USER_INFO.SEX, sex)
                .set(Tables.USER_INFO.CONCAT_PHONE, concatPhone)
                .set(Tables.USER_INFO.STATUS_FLAG, statusFlag)
//                通过newRecord()新增一条记录，完成批量插入
                .newRecord()
                .set(Tables.USER_INFO.USER_NAME, name + "record")
                .set(Tables.USER_INFO.USER_ID, userId + "record")
                .set(Tables.USER_INFO.SEX, sex)
                .set(Tables.USER_INFO.CONCAT_PHONE, concatPhone + "record")
                .set(Tables.USER_INFO.STATUS_FLAG, statusFlag)
                .execute();
        System.out.println("成功插入：" + execute + "条数据！");
    }

    /**
     * 插入成功返回ID，当然也可以返回其他的
     *
     * @param name
     * @param userId
     * @param sex
     * @param concatPhone
     * @param statusFlag
     * @return
     */
    private void insertByRecordAndGetId(String name, String userId, Byte sex, String concatPhone, Byte statusFlag) {
        UserInfoRecord userInfoRecord = dslContext.insertInto(Tables.USER_INFO)
                .set(Tables.USER_INFO.USER_NAME, name)
                .set(Tables.USER_INFO.USER_ID, userId)
                .set(Tables.USER_INFO.SEX, sex)
                .set(Tables.USER_INFO.CONCAT_PHONE, concatPhone)
                .set(Tables.USER_INFO.STATUS_FLAG, statusFlag)
//                返回想要的值，一般就返回ID,但是可以也返回多个值
                .returning(Tables.USER_INFO.ID, Tables.USER_INFO.USER_ID)
//                转化为Record
                .fetchOne();
//                通过Record获取id,如果有多个值可以在此返回，分开获取
        System.out.println("id:" + userInfoRecord.getId());
        System.out.println("user_id: " + userInfoRecord.getUserId());
    }

    /**
     * 通过API插入，id会自动返回
     *
     * @param name
     * @param userId
     * @param sex
     * @param concatPhone
     * @param statusFlag
     */
    private void insertByApi(String name, String userId, Byte sex, String concatPhone, Byte statusFlag) {

        UserInfoRecord record = dslContext.newRecord(Tables.USER_INFO);
        record.setUserName(name);
        record.setSex(sex);
        record.setUserId(userId);
        record.setConcatPhone(concatPhone);
        record.setStatusFlag(statusFlag);
//        返回成功数
        int insert = record.insert();
        System.out.println("id: " + record.getId());

        //        也可以进行批量插入
        List<UserInfoRecord> list = new ArrayList<>();
        record.setUserId(userId+"api");
        list.add(record);
        dslContext.batchInsert(list).execute();
    }


    @Override
    public void update(UserInfo userInfo) {
        updateBySql(userInfo.getId(), userInfo.getUserName(), userInfo.getStatusFlag());
    }

    /**
     * 使用sql可以灵活设置条件
     *
     * @param id
     * @param userName
     * @param statusFlag
     */
    private void updateBySql(Long id, String userName, Byte statusFlag) {
//        返回执行成功数
        int execute = dslContext.update(Tables.USER_INFO)
                .set(Tables.USER_INFO.USER_NAME, userName)
                .set(Tables.USER_INFO.STATUS_FLAG, statusFlag)
                .where(Tables.USER_INFO.ID.eq(id))
                .execute();
    }

    /**
     * 使用API更新，默认使用主键，所以主键必须传，如果不传那么生成的sql里面id=null,永远不会成功
     *
     * @param id
     * @param userName
     * @param statusFlag
     */
    private void updateByApi(Long id, String userName, Byte statusFlag) {
        UserInfoRecord record = dslContext.newRecord(Tables.USER_INFO);
        record.setId(id);
        record.setUserName(userName);
        record.setStatusFlag(statusFlag);
//        返回执行成功数
        int update = record.update();

//        也可以进行批量更新
//        List<UserInfoRecord> list = new ArrayList<>();
//        list.add(record);
//        dslContext.batchUpdate(list).execute();
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
