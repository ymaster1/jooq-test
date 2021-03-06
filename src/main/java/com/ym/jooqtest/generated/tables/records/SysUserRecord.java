/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables.records;


import com.ym.jooqtest.generated.tables.SysUser;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 系统用户表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUserRecord extends UpdatableRecordImpl<SysUserRecord> implements Record6<Long, String, String, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>study.sys_user.id</code>. 主键id
     */
    public SysUserRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_user.id</code>. 主键id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>study.sys_user.user_name</code>. 用户名
     */
    public SysUserRecord setUserName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_user.user_name</code>. 用户名
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>study.sys_user.password</code>. 用户密码
     */
    public SysUserRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_user.password</code>. 用户密码
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>study.sys_user.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public SysUserRecord setStatusFlag(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_user.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public Byte getStatusFlag() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>study.sys_user.server_create_time</code>. 系统创建时间
     */
    public SysUserRecord setServerCreateTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_user.server_create_time</code>. 系统创建时间
     */
    public LocalDateTime getServerCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>study.sys_user.server_update_time</code>. 系统更新时间
     */
    public SysUserRecord setServerUpdateTime(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_user.server_update_time</code>. 系统更新时间
     */
    public LocalDateTime getServerUpdateTime() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SysUser.SYS_USER.ID;
    }

    @Override
    public Field<String> field2() {
        return SysUser.SYS_USER.USER_NAME;
    }

    @Override
    public Field<String> field3() {
        return SysUser.SYS_USER.PASSWORD;
    }

    @Override
    public Field<Byte> field4() {
        return SysUser.SYS_USER.STATUS_FLAG;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SysUser.SYS_USER.SERVER_CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return SysUser.SYS_USER.SERVER_UPDATE_TIME;
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
        return getPassword();
    }

    @Override
    public Byte component4() {
        return getStatusFlag();
    }

    @Override
    public LocalDateTime component5() {
        return getServerCreateTime();
    }

    @Override
    public LocalDateTime component6() {
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
        return getPassword();
    }

    @Override
    public Byte value4() {
        return getStatusFlag();
    }

    @Override
    public LocalDateTime value5() {
        return getServerCreateTime();
    }

    @Override
    public LocalDateTime value6() {
        return getServerUpdateTime();
    }

    @Override
    public SysUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SysUserRecord value2(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public SysUserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public SysUserRecord value4(Byte value) {
        setStatusFlag(value);
        return this;
    }

    @Override
    public SysUserRecord value5(LocalDateTime value) {
        setServerCreateTime(value);
        return this;
    }

    @Override
    public SysUserRecord value6(LocalDateTime value) {
        setServerUpdateTime(value);
        return this;
    }

    @Override
    public SysUserRecord values(Long value1, String value2, String value3, Byte value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysUserRecord
     */
    public SysUserRecord() {
        super(SysUser.SYS_USER);
    }

    /**
     * Create a detached, initialised SysUserRecord
     */
    public SysUserRecord(Long id, String userName, String password, Byte statusFlag, LocalDateTime serverCreateTime, LocalDateTime serverUpdateTime) {
        super(SysUser.SYS_USER);

        setId(id);
        setUserName(userName);
        setPassword(password);
        setStatusFlag(statusFlag);
        setServerCreateTime(serverCreateTime);
        setServerUpdateTime(serverUpdateTime);
    }
}
