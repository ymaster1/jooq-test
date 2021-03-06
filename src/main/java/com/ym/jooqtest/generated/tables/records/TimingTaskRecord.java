/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables.records;


import com.ym.jooqtest.generated.tables.TimingTask;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 定时任务表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimingTaskRecord extends UpdatableRecordImpl<TimingTaskRecord> implements Record10<Long, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>study.timing_task.id</code>. 主键id
     */
    public TimingTaskRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.id</code>. 主键id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>study.timing_task.task_name</code>. 任务名称
     */
    public TimingTaskRecord setTaskName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.task_name</code>. 任务名称
     */
    public String getTaskName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>study.timing_task.service_name</code>. 方法所在的service
     */
    public TimingTaskRecord setServiceName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.service_name</code>. 方法所在的service
     */
    public String getServiceName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>study.timing_task.task_status</code>. 任务启用状态 0 停用   1  启用
     */
    public TimingTaskRecord setTaskStatus(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.task_status</code>. 任务启用状态 0 停用   1  启用
     */
    public Byte getTaskStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>study.timing_task.task_cron</code>. 时间表达式
     */
    public TimingTaskRecord setTaskCron(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.task_cron</code>. 时间表达式
     */
    public String getTaskCron() {
        return (String) get(4);
    }

    /**
     * Setter for <code>study.timing_task.task_desc</code>. 任务描述
     */
    public TimingTaskRecord setTaskDesc(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.task_desc</code>. 任务描述
     */
    public String getTaskDesc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>study.timing_task.method_name</code>. 方法名称
     */
    public TimingTaskRecord setMethodName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.method_name</code>. 方法名称
     */
    public String getMethodName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>study.timing_task.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public TimingTaskRecord setStatusFlag(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public Byte getStatusFlag() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>study.timing_task.server_create_time</code>. 系统创建时间
     */
    public TimingTaskRecord setServerCreateTime(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.server_create_time</code>. 系统创建时间
     */
    public LocalDateTime getServerCreateTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>study.timing_task.server_update_time</code>. 系统更新时间
     */
    public TimingTaskRecord setServerUpdateTime(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>study.timing_task.server_update_time</code>. 系统更新时间
     */
    public LocalDateTime getServerUpdateTime() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, String, Byte, String, String, String, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TimingTask.TIMING_TASK.ID;
    }

    @Override
    public Field<String> field2() {
        return TimingTask.TIMING_TASK.TASK_NAME;
    }

    @Override
    public Field<String> field3() {
        return TimingTask.TIMING_TASK.SERVICE_NAME;
    }

    @Override
    public Field<Byte> field4() {
        return TimingTask.TIMING_TASK.TASK_STATUS;
    }

    @Override
    public Field<String> field5() {
        return TimingTask.TIMING_TASK.TASK_CRON;
    }

    @Override
    public Field<String> field6() {
        return TimingTask.TIMING_TASK.TASK_DESC;
    }

    @Override
    public Field<String> field7() {
        return TimingTask.TIMING_TASK.METHOD_NAME;
    }

    @Override
    public Field<Byte> field8() {
        return TimingTask.TIMING_TASK.STATUS_FLAG;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return TimingTask.TIMING_TASK.SERVER_CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return TimingTask.TIMING_TASK.SERVER_UPDATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTaskName();
    }

    @Override
    public String component3() {
        return getServiceName();
    }

    @Override
    public Byte component4() {
        return getTaskStatus();
    }

    @Override
    public String component5() {
        return getTaskCron();
    }

    @Override
    public String component6() {
        return getTaskDesc();
    }

    @Override
    public String component7() {
        return getMethodName();
    }

    @Override
    public Byte component8() {
        return getStatusFlag();
    }

    @Override
    public LocalDateTime component9() {
        return getServerCreateTime();
    }

    @Override
    public LocalDateTime component10() {
        return getServerUpdateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTaskName();
    }

    @Override
    public String value3() {
        return getServiceName();
    }

    @Override
    public Byte value4() {
        return getTaskStatus();
    }

    @Override
    public String value5() {
        return getTaskCron();
    }

    @Override
    public String value6() {
        return getTaskDesc();
    }

    @Override
    public String value7() {
        return getMethodName();
    }

    @Override
    public Byte value8() {
        return getStatusFlag();
    }

    @Override
    public LocalDateTime value9() {
        return getServerCreateTime();
    }

    @Override
    public LocalDateTime value10() {
        return getServerUpdateTime();
    }

    @Override
    public TimingTaskRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TimingTaskRecord value2(String value) {
        setTaskName(value);
        return this;
    }

    @Override
    public TimingTaskRecord value3(String value) {
        setServiceName(value);
        return this;
    }

    @Override
    public TimingTaskRecord value4(Byte value) {
        setTaskStatus(value);
        return this;
    }

    @Override
    public TimingTaskRecord value5(String value) {
        setTaskCron(value);
        return this;
    }

    @Override
    public TimingTaskRecord value6(String value) {
        setTaskDesc(value);
        return this;
    }

    @Override
    public TimingTaskRecord value7(String value) {
        setMethodName(value);
        return this;
    }

    @Override
    public TimingTaskRecord value8(Byte value) {
        setStatusFlag(value);
        return this;
    }

    @Override
    public TimingTaskRecord value9(LocalDateTime value) {
        setServerCreateTime(value);
        return this;
    }

    @Override
    public TimingTaskRecord value10(LocalDateTime value) {
        setServerUpdateTime(value);
        return this;
    }

    @Override
    public TimingTaskRecord values(Long value1, String value2, String value3, Byte value4, String value5, String value6, String value7, Byte value8, LocalDateTime value9, LocalDateTime value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimingTaskRecord
     */
    public TimingTaskRecord() {
        super(TimingTask.TIMING_TASK);
    }

    /**
     * Create a detached, initialised TimingTaskRecord
     */
    public TimingTaskRecord(Long id, String taskName, String serviceName, Byte taskStatus, String taskCron, String taskDesc, String methodName, Byte statusFlag, LocalDateTime serverCreateTime, LocalDateTime serverUpdateTime) {
        super(TimingTask.TIMING_TASK);

        setId(id);
        setTaskName(taskName);
        setServiceName(serviceName);
        setTaskStatus(taskStatus);
        setTaskCron(taskCron);
        setTaskDesc(taskDesc);
        setMethodName(methodName);
        setStatusFlag(statusFlag);
        setServerCreateTime(serverCreateTime);
        setServerUpdateTime(serverUpdateTime);
    }
}
