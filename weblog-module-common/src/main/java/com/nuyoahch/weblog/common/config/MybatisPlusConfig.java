package com.nuyoahch.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: weblog
 * @author: NuyoahCh
 * @create: 2025-02-25
 * @description:
 */
@Configuration
@MapperScan("com.nuyoahch.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}