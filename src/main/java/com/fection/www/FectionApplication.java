package com.fection.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.fection.www.mapper")
public class FectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FectionApplication.class, args);
    }

}
