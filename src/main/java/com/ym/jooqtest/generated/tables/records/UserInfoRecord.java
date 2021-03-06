/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables.records;


import com.ym.jooqtest.generated.tables.UserInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户信息表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoRecord extends UpdatableRecordImpl<UserInfoRecord> implements Record11<Long, String, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>study.user_info.id</code>. 主键id
     */
    public UserInfoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.id</code>. 主键id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>study.user_info.user_name</code>. 用户名
     */
    public UserInfoRecord setUserName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.user_name</code>. 用户名
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>study.user_info.user_id</code>. 用户唯一编号
     */
    public UserInfoRecord setUserId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.user_id</code>. 用户唯一编号
     */
    public String getUserId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>study.user_info.adder</code>. 地址
     */
    public UserInfoRecord setAdder(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.adder</code>. 地址
     */
    public String getAdder() {
        return (String) get(3);
    }

    /**
     * Setter for <code>study.user_info.sex</code>. 性别
     */
    public UserInfoRecord setSex(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.sex</code>. 性别
     */
    public Byte getSex() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>study.user_info.country</code>. 国家
     */
    public UserInfoRecord setCountry(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.country</code>. 国家
     */
    public String getCountry() {
        return (String) get(5);
    }

    /**
     * Setter for <code>study.user_info.city</code>. 城市
     */
    public UserInfoRecord setCity(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.city</code>. 城市
     */
    public String getCity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>study.user_info.concat_phone</code>. 联系电话
     */
    public UserInfoRecord setConcatPhone(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.concat_phone</code>. 联系电话
     */
    public String getConcatPhone() {
        return (String) get(7);
    }

    /**
     * Setter for <code>study.user_info.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public UserInfoRecord setStatusFlag(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public Byte getStatusFlag() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>study.user_info.server_create_time</code>. 系统创建时间
     */
    public UserInfoRecord setServerCreateTime(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.server_create_time</code>. 系统创建时间
     */
    public LocalDateTime getServerCreateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>study.user_info.server_update_time</code>. 系统更新时间
     */
    public UserInfoRecord setServerUpdateTime(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>study.user_info.server_update_time</code>. 系统更新时间
     */
    public LocalDateTime getServerUpdateTime() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserInfo.USER_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return UserInfo.USER_INFO.USER_NAME;
    }

    @Override
    public Field<String> field3() {
        return UserInfo.USER_INFO.USER_ID;
    }

    @Override
    public Field<String> field4() {
        return UserInfo.USER_INFO.ADDER;
    }

    @Override
    public Field<Byte> field5() {
        return UserInfo.USER_INFO.SEX;
    }

    @Override
    public Field<String> field6() {
        return UserInfo.USER_INFO.COUNTRY;
    }

    @Override
    public Field<String> field7() {
        return UserInfo.USER_INFO.CITY;
    }

    @Override
    public Field<String> field8() {
        return UserInfo.USER_INFO.CONCAT_PHONE;
    }

    @Override
    public Field<Byte> field9() {
        return UserInfo.USER_INFO.STATUS_FLAG;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return UserInfo.USER_INFO.SERVER_CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return UserInfo.USER_INFO.SERVER_UPDATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserName();
    }

    @Override
    public String component3() {
        return getUserId();
    }

    @Override
    public String component4() {
        return getAdder();
    }

    @Override
    public Byte component5() {
        return getSex();
    }

    @Override
    public String component6() {
        return getCountry();
    }

    @Override
    public String component7() {
        return getCity();
    }

    @Override
    public String component8() {
        return getConcatPhone();
    }

    @Override
    public Byte component9() {
        return getStatusFlag();
    }

    @Override
    public LocalDateTime component10() {
        return getServerCreateTime();
    }

    @Override
    public LocalDateTime component11() {
        return getServerUpdateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserName();
    }

    @Override
    public String value3() {
        return getUserId();
    }

    @Override
    public String value4() {
        return getAdder();
    }

    @Override
    public Byte value5() {
        return getSex();
    }

    @Override
    public String value6() {
        return getCountry();
    }

    @Override
    public String value7() {
        return getCity();
    }

    @Override
    public String value8() {
        return getConcatPhone();
    }

    @Override
    public Byte value9() {
        return getStatusFlag();
    }

    @Override
    public LocalDateTime value10() {
        return getServerCreateTime();
    }

    @Override
    public LocalDateTime value11() {
        return getServerUpdateTime();
    }

    @Override
    public UserInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UserInfoRecord value2(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public UserInfoRecord value3(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserInfoRecord value4(String value) {
        setAdder(value);
        return this;
    }

    @Override
    public UserInfoRecord value5(Byte value) {
        setSex(value);
        return this;
    }

    @Override
    public UserInfoRecord value6(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public UserInfoRecord value7(String value) {
        setCity(value);
        return this;
    }

    @Override
    public UserInfoRecord value8(String value) {
        setConcatPhone(value);
        return this;
    }

    @Override
    public UserInfoRecord value9(Byte value) {
        setStatusFlag(value);
        return this;
    }

    @Override
    public UserInfoRecord value10(LocalDateTime value) {
        setServerCreateTime(value);
        return this;
    }

    @Override
    public UserInfoRecord value11(LocalDateTime value) {
        setServerUpdateTime(value);
        return this;
    }

    @Override
    public UserInfoRecord values(Long value1, String value2, String value3, String value4, Byte value5, String value6, String value7, String value8, Byte value9, LocalDateTime value10, LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserInfoRecord
     */
    public UserInfoRecord() {
        super(UserInfo.USER_INFO);
    }

    /**
     * Create a detached, initialised UserInfoRecord
     */
    public UserInfoRecord(Long id, String userName, String userId, String adder, Byte sex, String country, String city, String concatPhone, Byte statusFlag, LocalDateTime serverCreateTime, LocalDateTime serverUpdateTime) {
        super(UserInfo.USER_INFO);

        setId(id);
        setUserName(userName);
        setUserId(userId);
        setAdder(adder);
        setSex(sex);
        setCountry(country);
        setCity(city);
        setConcatPhone(concatPhone);
        setStatusFlag(statusFlag);
        setServerCreateTime(serverCreateTime);
        setServerUpdateTime(serverUpdateTime);
    }
}
