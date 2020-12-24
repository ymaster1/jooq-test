package com.ym.jooqtest;

import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JooqTestApplicationTests {
    @Autowired
    DSLContext dslContext;
    @Test
    void contextLoads() {
    }

}
