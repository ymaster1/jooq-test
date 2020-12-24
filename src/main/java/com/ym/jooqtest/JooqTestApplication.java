package com.ym.jooqtest;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ymast
 */
@SpringBootApplication
public class JooqTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(JooqTestApplication.class, args);
    }

}
