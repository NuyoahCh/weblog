package com.nuyoahch.weblog.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @program: weblog
 * @author: NuyoahCh
 * @create: 2025-02-25
 * @description:
 */
@Configuration
@EnableSwagger2WebMvc
@Profile("dev")
public class Knife4jConfig {

    @Bean("webApi")
    public Docket createApiDoc() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                // 分组名称
                .groupName("Web 前台接口")
                .select()
                // 这里指定 Controller 扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.nuyoahch.weblog.web.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    /**
     * 构建 API 信息
     *
     * @return
     */
    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("Weblog 博客前台接口文档") // 标题
                .description("Weblog 是一款由 Spring Boot + Vue 3.2 + Vite 4.3 开发的前后端分离博客。") // 描述
                .termsOfServiceUrl("https://github.com/NuyoahCh") // API 服务条款
                .contact(new Contact("NuyoahCh", "https://github.com/NuyoahCh", "springoflotus@gmail.com")) // 联系人
                .version("1.0") // 版本号
                .build();
    }
}
