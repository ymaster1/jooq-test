/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables;


import com.ym.jooqtest.generated.Indexes;
import com.ym.jooqtest.generated.Keys;
import com.ym.jooqtest.generated.Study;
import com.ym.jooqtest.generated.tables.records.TimingTaskRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 定时任务表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimingTask extends TableImpl<TimingTaskRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>study.timing_task</code>
     */
    public static final TimingTask TIMING_TASK = new TimingTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimingTaskRecord> getRecordType() {
        return TimingTaskRecord.class;
    }

    /**
     * The column <code>study.timing_task.id</code>. 主键id
     */
    public final TableField<TimingTaskRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>study.timing_task.task_name</code>. 任务名称
     */
    public final TableField<TimingTaskRecord, String> TASK_NAME = createField(DSL.name("task_name"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "任务名称");

    /**
     * The column <code>study.timing_task.service_name</code>. 方法所在的service
     */
    public final TableField<TimingTaskRecord, String> SERVICE_NAME = createField(DSL.name("service_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "方法所在的service");

    /**
     * The column <code>study.timing_task.task_status</code>. 任务启用状态 0 停用   1  启用
     */
    public final TableField<TimingTaskRecord, Byte> TASK_STATUS = createField(DSL.name("task_status"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "任务启用状态 0 停用   1  启用");

    /**
     * The column <code>study.timing_task.task_cron</code>. 时间表达式
     */
    public final TableField<TimingTaskRecord, String> TASK_CRON = createField(DSL.name("task_cron"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "时间表达式");

    /**
     * The column <code>study.timing_task.task_desc</code>. 任务描述
     */
    public final TableField<TimingTaskRecord, String> TASK_DESC = createField(DSL.name("task_desc"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "任务描述");

    /**
     * The column <code>study.timing_task.method_name</code>. 方法名称
     */
    public final TableField<TimingTaskRecord, String> METHOD_NAME = createField(DSL.name("method_name"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "方法名称");

    /**
     * The column <code>study.timing_task.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public final TableField<TimingTaskRecord, Byte> STATUS_FLAG = createField(DSL.name("status_flag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "是否可用 0 不可用 1可用");

    /**
     * The column <code>study.timing_task.server_create_time</code>. 系统创建时间
     */
    public final TableField<TimingTaskRecord, LocalDateTime> SERVER_CREATE_TIME = createField(DSL.name("server_create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "系统创建时间");

    /**
     * The column <code>study.timing_task.server_update_time</code>. 系统更新时间
     */
    public final TableField<TimingTaskRecord, LocalDateTime> SERVER_UPDATE_TIME = createField(DSL.name("server_update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "系统更新时间");

    private TimingTask(Name alias, Table<TimingTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimingTask(Name alias, Table<TimingTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("定时任务表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>study.timing_task</code> table reference
     */
    public TimingTask(String alias) {
        this(DSL.name(alias), TIMING_TASK);
    }

    /**
     * Create an aliased <code>study.timing_task</code> table reference
     */
    public TimingTask(Name alias) {
        this(alias, TIMING_TASK);
    }

    /**
     * Create a <code>study.timing_task</code> table reference
     */
    public TimingTask() {
        this(DSL.name("timing_task"), null);
    }

    public <O extends Record> TimingTask(Table<O> child, ForeignKey<O, TimingTaskRecord> key) {
        super(child, key, TIMING_TASK);
    }

    @Override
    public Schema getSchema() {
        return Study.STUDY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TIMING_TASK_IDX_SERVER_CREATE_TIME);
    }

    @Override
    public Identity<TimingTaskRecord, Long> getIdentity() {
        return (Identity<TimingTaskRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TimingTaskRecord> getPrimaryKey() {
        return Keys.KEY_TIMING_TASK_PRIMARY;
    }

    @Override
    public List<UniqueKey<TimingTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TimingTaskRecord>>asList(Keys.KEY_TIMING_TASK_PRIMARY);
    }

    @Override
    public TimingTask as(String alias) {
        return new TimingTask(DSL.name(alias), this);
    }

    @Override
    public TimingTask as(Name alias) {
        return new TimingTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TimingTask rename(String name) {
        return new TimingTask(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TimingTask rename(Name name) {
        return new TimingTask(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}