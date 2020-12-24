/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables.daos;


import com.ym.jooqtest.generated.tables.SysUserRole;
import com.ym.jooqtest.generated.tables.records.SysUserRoleRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 系统用户角色关系表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUserRoleDao extends DAOImpl<SysUserRoleRecord, com.ym.jooqtest.generated.tables.pojos.SysUserRole, Long> {

    /**
     * Create a new SysUserRoleDao without any configuration
     */
    public SysUserRoleDao() {
        super(SysUserRole.SYS_USER_ROLE, com.ym.jooqtest.generated.tables.pojos.SysUserRole.class);
    }

    /**
     * Create a new SysUserRoleDao with an attached configuration
     */
    public SysUserRoleDao(Configuration configuration) {
        super(SysUserRole.SYS_USER_ROLE, com.ym.jooqtest.generated.tables.pojos.SysUserRole.class, configuration);
    }

    @Override
    public Long getId(com.ym.jooqtest.generated.tables.pojos.SysUserRole object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(SysUserRole.SYS_USER_ROLE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchById(Long... values) {
        return fetch(SysUserRole.SYS_USER_ROLE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.ym.jooqtest.generated.tables.pojos.SysUserRole fetchOneById(Long value) {
        return fetchOne(SysUserRole.SYS_USER_ROLE.ID, value);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchRangeOfUserId(String lowerInclusive, String upperInclusive) {
        return fetchRange(SysUserRole.SYS_USER_ROLE.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchByUserId(String... values) {
        return fetch(SysUserRole.SYS_USER_ROLE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>role_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchRangeOfRoleId(String lowerInclusive, String upperInclusive) {
        return fetchRange(SysUserRole.SYS_USER_ROLE.ROLE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchByRoleId(String... values) {
        return fetch(SysUserRole.SYS_USER_ROLE.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>status_flag BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchRangeOfStatusFlag(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(SysUserRole.SYS_USER_ROLE.STATUS_FLAG, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status_flag IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchByStatusFlag(Byte... values) {
        return fetch(SysUserRole.SYS_USER_ROLE.STATUS_FLAG, values);
    }

    /**
     * Fetch records that have <code>server_create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchRangeOfServerCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(SysUserRole.SYS_USER_ROLE.SERVER_CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>server_create_time IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchByServerCreateTime(LocalDateTime... values) {
        return fetch(SysUserRole.SYS_USER_ROLE.SERVER_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>server_update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchRangeOfServerUpdateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(SysUserRole.SYS_USER_ROLE.SERVER_UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>server_update_time IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysUserRole> fetchByServerUpdateTime(LocalDateTime... values) {
        return fetch(SysUserRole.SYS_USER_ROLE.SERVER_UPDATE_TIME, values);
    }
}