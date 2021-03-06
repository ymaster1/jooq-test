/*
 * This file is generated by jOOQ.
 */
package com.ym.jooqtest.generated.tables.daos;


import com.ym.jooqtest.generated.tables.SysRole;
import com.ym.jooqtest.generated.tables.records.SysRoleRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 系统角色表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysRoleDao extends DAOImpl<SysRoleRecord, com.ym.jooqtest.generated.tables.pojos.SysRole, Long> {

    /**
     * Create a new SysRoleDao without any configuration
     */
    public SysRoleDao() {
        super(SysRole.SYS_ROLE, com.ym.jooqtest.generated.tables.pojos.SysRole.class);
    }

    /**
     * Create a new SysRoleDao with an attached configuration
     */
    public SysRoleDao(Configuration configuration) {
        super(SysRole.SYS_ROLE, com.ym.jooqtest.generated.tables.pojos.SysRole.class, configuration);
    }

    @Override
    public Long getId(com.ym.jooqtest.generated.tables.pojos.SysRole object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(SysRole.SYS_ROLE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchById(Long... values) {
        return fetch(SysRole.SYS_ROLE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.ym.jooqtest.generated.tables.pojos.SysRole fetchOneById(Long value) {
        return fetchOne(SysRole.SYS_ROLE.ID, value);
    }

    /**
     * Fetch records that have <code>role_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchRangeOfRoleName(String lowerInclusive, String upperInclusive) {
        return fetchRange(SysRole.SYS_ROLE.ROLE_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>role_name IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchByRoleName(String... values) {
        return fetch(SysRole.SYS_ROLE.ROLE_NAME, values);
    }

    /**
     * Fetch records that have <code>role_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchRangeOfRoleCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(SysRole.SYS_ROLE.ROLE_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>role_code IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchByRoleCode(String... values) {
        return fetch(SysRole.SYS_ROLE.ROLE_CODE, values);
    }

    /**
     * Fetch records that have <code>status_flag BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchRangeOfStatusFlag(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(SysRole.SYS_ROLE.STATUS_FLAG, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status_flag IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchByStatusFlag(Byte... values) {
        return fetch(SysRole.SYS_ROLE.STATUS_FLAG, values);
    }

    /**
     * Fetch records that have <code>server_create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchRangeOfServerCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(SysRole.SYS_ROLE.SERVER_CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>server_create_time IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchByServerCreateTime(LocalDateTime... values) {
        return fetch(SysRole.SYS_ROLE.SERVER_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>server_update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchRangeOfServerUpdateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(SysRole.SYS_ROLE.SERVER_UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>server_update_time IN (values)</code>
     */
    public List<com.ym.jooqtest.generated.tables.pojos.SysRole> fetchByServerUpdateTime(LocalDateTime... values) {
        return fetch(SysRole.SYS_ROLE.SERVER_UPDATE_TIME, values);
    }
}
