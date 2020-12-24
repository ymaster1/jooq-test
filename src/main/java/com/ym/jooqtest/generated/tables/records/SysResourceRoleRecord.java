/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables.records;


import com.ym.jooqtest.generated.tables.SysResourceRole;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 系统资源角色关系表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysResourceRoleRecord extends UpdatableRecordImpl<SysResourceRoleRecord> implements Record6<Long, String, String, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>study.sys_resource_role.id</code>. 主键id
     */
    public SysResourceRoleRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_resource_role.id</code>. 主键id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>study.sys_resource_role.resource_id</code>. 资源id
     */
    public SysResourceRoleRecord setResourceId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_resource_role.resource_id</code>. 资源id
     */
    public String getResourceId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>study.sys_resource_role.role_id</code>. 角色id
     */
    public SysResourceRoleRecord setRoleId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_resource_role.role_id</code>. 角色id
     */
    public String getRoleId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>study.sys_resource_role.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public SysResourceRoleRecord setStatusFlag(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_resource_role.status_flag</code>. 是否可用 0 不可用 1可用
     */
    public Byte getStatusFlag() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>study.sys_resource_role.server_create_time</code>. 系统创建时间
     */
    public SysResourceRoleRecord setServerCreateTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_resource_role.server_create_time</code>. 系统创建时间
     */
    public LocalDateTime getServerCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>study.sys_resource_role.server_update_time</code>. 系统更新时间
     */
    public SysResourceRoleRecord setServerUpdateTime(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>study.sys_resource_role.server_update_time</code>. 系统更新时间
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
        return SysResourceRole.SYS_RESOURCE_ROLE.ID;
    }

    @Override
    public Field<String> field2() {
        return SysResourceRole.SYS_RESOURCE_ROLE.RESOURCE_ID;
    }

    @Override
    public Field<String> field3() {
        return SysResourceRole.SYS_RESOURCE_ROLE.ROLE_ID;
    }

    @Override
    public Field<Byte> field4() {
        return SysResourceRole.SYS_RESOURCE_ROLE.STATUS_FLAG;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SysResourceRole.SYS_RESOURCE_ROLE.SERVER_CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return SysResourceRole.SYS_RESOURCE_ROLE.SERVER_UPDATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getResourceId();
    }

    @Override
    public String component3() {
        return getRoleId();
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
        return getResourceId();
    }

    @Override
    public String value3() {
        return getRoleId();
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
    public SysResourceRoleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SysResourceRoleRecord value2(String value) {
        setResourceId(value);
        return this;
    }

    @Override
    public SysResourceRoleRecord value3(String value) {
        setRoleId(value);
        return this;
    }

    @Override
    public SysResourceRoleRecord value4(Byte value) {
        setStatusFlag(value);
        return this;
    }

    @Override
    public SysResourceRoleRecord value5(LocalDateTime value) {
        setServerCreateTime(value);
        return this;
    }

    @Override
    public SysResourceRoleRecord value6(LocalDateTime value) {
        setServerUpdateTime(value);
        return this;
    }

    @Override
    public SysResourceRoleRecord values(Long value1, String value2, String value3, Byte value4, LocalDateTime value5, LocalDateTime value6) {
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
     * Create a detached SysResourceRoleRecord
     */
    public SysResourceRoleRecord() {
        super(SysResourceRole.SYS_RESOURCE_ROLE);
    }

    /**
     * Create a detached, initialised SysResourceRoleRecord
     */
    public SysResourceRoleRecord(Long id, String resourceId, String roleId, Byte statusFlag, LocalDateTime serverCreateTime, LocalDateTime serverUpdateTime) {
        super(SysResourceRole.SYS_RESOURCE_ROLE);

        setId(id);
        setResourceId(resourceId);
        setRoleId(roleId);
        setStatusFlag(statusFlag);
        setServerCreateTime(serverCreateTime);
        setServerUpdateTime(serverUpdateTime);
    }
}