package com.ym.jooqtest.api.controller

import com.ym.jooqtest.api.UserInfoApi
import com.ym.jooqtest.generated.tables.pojos.UserInfo
import com.ym.jooqtest.service.UserInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

/**
 * @author ymaster1
 * @Date 2020/12/24 14:51
 * @Description:
 */
@RestController
class UserInfoController : UserInfoApi {
    @Autowired
    private lateinit var userInfoService: UserInfoService

    override fun getAll(): MutableList<UserInfo> {
        return userInfoService.all
    }

    override fun getById(id: Long): UserInfo {
        return userInfoService.getById(id)
    }
}