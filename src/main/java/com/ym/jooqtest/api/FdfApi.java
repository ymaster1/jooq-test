package com.ym.jooqtest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * @Author ymaster1
 * @Date 2021/1/25 16:24
 * @Description
 */
@RequestMapping("/pdf")
public interface FdfApi {
    @GetMapping("/create")
    public void download(@RequestParam(name = "debtId") Long debtId, @RequestParam(name = "type") Integer type, @RequestParam(name = "scene") Integer scene, HttpServletResponse response);
}
