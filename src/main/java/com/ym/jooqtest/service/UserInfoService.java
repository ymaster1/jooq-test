package com.ym.jooqtest.service;

import com.ym.jooqtest.generated.tables.pojos.UserInfo;

import java.util.List;

/**
 * @author ymaster1
 * @Date 2020/12/24 10:37
 * @Description:
 */
public interface UserInfoService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<UserInfo> getAll();

    /**
     * 根据id获取
     * @param id
     * @return
     */
    UserInfo getById(Long id);

    /**
     * 新增
     * @param userInfo
     * @return
     */
    void create(UserInfo userInfo);

    /**
     * 更新
     * 暂时还没有对null字段做处理，后续会补上
     * @param userInfo
     * @return
     */
    void update(UserInfo userInfo);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Long id);
}
