package com.ifyoutry.mblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ifyoutry.mblog.mapper")
@SpringBootApplication
public class MBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MBlogApplication.class, args);
    }

}
