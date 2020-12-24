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
}
