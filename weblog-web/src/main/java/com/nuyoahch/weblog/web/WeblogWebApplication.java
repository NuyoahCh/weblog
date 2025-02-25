package com.nuyoahch.weblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: weblog
 * @author: NuyoahCh
 * @create: 2025-02-25
 * @description: Web 启动类
 */
@SpringBootApplication
@ComponentScan({"com.nuyoahch.weblog.*"})
public class WeblogWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeblogWebApplication.class, args);
    }
}
