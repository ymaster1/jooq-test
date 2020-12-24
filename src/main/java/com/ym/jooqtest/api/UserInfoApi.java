package com.ym.jooqtest.api;

import com.ym.jooqtest.generated.tables.pojos.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ymaster1
 * @Date 2020/12/24 14:47
 * @Description:
 */
@RequestMapping("/jooq/userinfo")
public interface UserInfoApi {
    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/getall")
    List<UserInfo> getAll();
}
