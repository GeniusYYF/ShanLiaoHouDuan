package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.mapper") //扫描的mapper
@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo3Application.class, args);
    }

}
