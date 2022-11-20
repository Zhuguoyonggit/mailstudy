package com.example.mailstudy.product;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mailstudy.product.dao")
@SpringBootApplication
public class MailstudyProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailstudyProductApplication.class, args);
    }

}
