package com.learn.product.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LuHailun
 * @Title: WebApplication
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 19:05
 */
@SpringBootApplication
@MapperScan("com.learn.product.dao.mapper")
@EnableDiscoveryClient
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
