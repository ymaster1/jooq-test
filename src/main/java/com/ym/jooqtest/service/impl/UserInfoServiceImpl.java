package com.ym.jooqtest.service.impl;

import com.ym.jooqtest.generated.Tables;
import com.ym.jooqtest.generated.tables.pojos.UserInfo;
import com.ym.jooqtest.generated.tables.records.UserInfoRecord;
import com.ym.jooqtest.service.UserInfoService;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectJoinStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ymaster1
 * @Date 2020/12/24 10:43
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
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
            list.add(info);
        });
        return list;
    }

    /**
     * Result 的into方法可以将默认的Record转换为更精确的表Record
     * 通过Result<UserInfoRecord> 获取值，不需要多次指定表名
     *
     * Record 也有into方法，是一样的，不过没必要
     * UserInfoRecord into = e.into(Tables.USER_INFO);
     *
     * @param fetch
     */
    private List<UserInfo> getListByTableRecord(Result<Record> fetch) {
        List<UserInfo> list = new ArrayList<>();
        Result<UserInfoRecord> into = fetch.into(Tables.USER_INFO);
        into.forEach(e -> {
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
     * @param from
     * @return
     */
    private List<UserInfo> getListByAnyRecord(SelectJoinStep<Record> from){
//        返回指定表的Record结果集对象
        Result<UserInfoRecord> userInfoRecords = from.fetchInto(Tables.USER_INFO);
//        返回指定类型的List
        List<UserInfoRecord> userInfoRecords1 = from.fetchInto(UserInfoRecord.class);
//        返回指定类型list
        List<UserInfo> list = from.fetchInto(UserInfo.class);
        return list;

    }
}
