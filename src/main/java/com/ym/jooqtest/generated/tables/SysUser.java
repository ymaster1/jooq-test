/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables;


import com.ym.jooqtest.generated.Indexes;
import com.ym.jooqtest.generated.Keys;
import com.ym.jooqtest.generated.Study;
import com.ym.jooqtest.generated.tables.records.SysUserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 系统用户表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUser extends TableImpl<SysUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>study.sys_user</code>
     */
    public static final SysUser SYS_USER = new SysUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysUserRecord> getRecordType() {
        return SysUserRecord.class;
    }

    /**
     * The column <code>study.sys_user.id</code>. 主键id
     */
    public final TableField<SysUserRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>study.sys_user.user_name</code>. 用户名
     */
    public final TableField<SysUserRecord, String> USER_NAME = createField(DSL.name("user_name"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "用户名");

    /**
     * The column <code>study.sys_user.password</code>. 用户密码
     */
    public final TableField<SysUserRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "用户密码");

    /**
     * The column <code>study.sys_user.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public final TableField<SysUserRecord, Byte> STATUS_FLAG = createField(DSL.name("status_flag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "是否可用 0 不可用 1可用");

    /**
     * The column <code>study.sys_user.server_create_time</code>. 系统创建时间
     */
    public final TableField<SysUserRecord, LocalDateTime> SERVER_CREATE_TIME = createField(DSL.name("server_create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "系统创建时间");

    /**
     * The column <code>study.sys_user.server_update_time</code>. 系统更新时间
     */
    public final TableField<SysUserRecord, LocalDateTime> SERVER_UPDATE_TIME = createField(DSL.name("server_update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "系统更新时间");

    private SysUser(Name alias, Table<SysUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysUser(Name alias, Table<SysUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("系统用户表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>study.sys_user</code> table reference
     */
    public SysUser(String alias) {
        this(DSL.name(alias), SYS_USER);
    }

    /**
     * Create an aliased <code>study.sys_user</code> table reference
     */
    public SysUser(Name alias) {
        this(alias, SYS_USER);
    }

    /**
     * Create a <code>study.sys_user</code> table reference
     */
    public SysUser() {
        this(DSL.name("sys_user"), null);
    }

    public <O extends Record> SysUser(Table<O> child, ForeignKey<O, SysUserRecord> key) {
        super(child, key, SYS_USER);
    }

    @Override
    public Schema getSchema() {
        return Study.STUDY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_USER_IDX_SERVER_CREATE_TIME);
    }

    @Override
    public Identity<SysUserRecord, Long> getIdentity() {
        return (Identity<SysUserRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SysUserRecord> getPrimaryKey() {
        return Keys.KEY_SYS_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysUserRecord>> getKeys() {
        return Arrays.<UniqueKey<SysUserRecord>>asList(Keys.KEY_SYS_USER_PRIMARY);
    }

    @Override
    public SysUser as(String alias) {
        return new SysUser(DSL.name(alias), this);
    }

    @Override
    public SysUser as(Name alias) {
        return new SysUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysUser rename(String name) {
        return new SysUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysUser rename(Name name) {
        return new SysUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
