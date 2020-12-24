/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables;


import com.ym.jooqtest.generated.Indexes;
import com.ym.jooqtest.generated.Keys;
import com.ym.jooqtest.generated.Study;
import com.ym.jooqtest.generated.tables.records.UserInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 用户信息表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfo extends TableImpl<UserInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>study.user_info</code>
     */
    public static final UserInfo USER_INFO = new UserInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserInfoRecord> getRecordType() {
        return UserInfoRecord.class;
    }

    /**
     * The column <code>study.user_info.id</code>. 主键id
     */
    public final TableField<UserInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>study.user_info.user_name</code>. 用户名
     */
    public final TableField<UserInfoRecord, String> USER_NAME = createField(DSL.name("user_name"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "用户名");

    /**
     * The column <code>study.user_info.user_id</code>. 用户唯一编号
     */
    public final TableField<UserInfoRecord, String> USER_ID = createField(DSL.name("user_id"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "用户唯一编号");

    /**
     * The column <code>study.user_info.adder</code>. 地址
     */
    public final TableField<UserInfoRecord, String> ADDER = createField(DSL.name("adder"), SQLDataType.VARCHAR(30).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "地址");

    /**
     * The column <code>study.user_info.sex</code>. 性别
     */
    public final TableField<UserInfoRecord, Byte> SEX = createField(DSL.name("sex"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "性别");

    /**
     * The column <code>study.user_info.country</code>. 国家
     */
    public final TableField<UserInfoRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "国家");

    /**
     * The column <code>study.user_info.city</code>. 城市
     */
    public final TableField<UserInfoRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "城市");

    /**
     * The column <code>study.user_info.concat_phone</code>. 联系电话
     */
    public final TableField<UserInfoRecord, String> CONCAT_PHONE = createField(DSL.name("concat_phone"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "联系电话");

    /**
     * The column <code>study.user_info.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public final TableField<UserInfoRecord, Byte> STATUS_FLAG = createField(DSL.name("status_flag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "是否可用 0 不可用 1可用");

    /**
     * The column <code>study.user_info.server_create_time</code>. 系统创建时间
     */
    public final TableField<UserInfoRecord, LocalDateTime> SERVER_CREATE_TIME = createField(DSL.name("server_create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "系统创建时间");

    /**
     * The column <code>study.user_info.server_update_time</code>. 系统更新时间
     */
    public final TableField<UserInfoRecord, LocalDateTime> SERVER_UPDATE_TIME = createField(DSL.name("server_update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "系统更新时间");

    private UserInfo(Name alias, Table<UserInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserInfo(Name alias, Table<UserInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户信息表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>study.user_info</code> table reference
     */
    public UserInfo(String alias) {
        this(DSL.name(alias), USER_INFO);
    }

    /**
     * Create an aliased <code>study.user_info</code> table reference
     */
    public UserInfo(Name alias) {
        this(alias, USER_INFO);
    }

    /**
     * Create a <code>study.user_info</code> table reference
     */
    public UserInfo() {
        this(DSL.name("user_info"), null);
    }

    public <O extends Record> UserInfo(Table<O> child, ForeignKey<O, UserInfoRecord> key) {
        super(child, key, USER_INFO);
    }

    @Override
    public Schema getSchema() {
        return Study.STUDY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_INFO_IDX_SERVER_CREATE_TIME, Indexes.USER_INFO_IDX_USER_ID);
    }

    @Override
    public Identity<UserInfoRecord, Long> getIdentity() {
        return (Identity<UserInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserInfoRecord> getPrimaryKey() {
        return Keys.KEY_USER_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<UserInfoRecord>>asList(Keys.KEY_USER_INFO_PRIMARY);
    }

    @Override
    public UserInfo as(String alias) {
        return new UserInfo(DSL.name(alias), this);
    }

    @Override
    public UserInfo as(Name alias) {
        return new UserInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserInfo rename(String name) {
        return new UserInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserInfo rename(Name name) {
        return new UserInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
