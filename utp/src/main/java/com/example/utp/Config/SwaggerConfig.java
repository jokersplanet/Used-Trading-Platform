package com.example.utp.Config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {

    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.example";
    public static final String VERSION = "1.0.0";
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any()) // 可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("二手交易市场")   //设置文档的标题
                .description("二手交易市场 API 接口文档")   // 设置文档的描述
                .version(VERSION)   // 设置文档的版本
                .contact(new Contact("GCT", "", "***@qq.com"))
                .termsOfServiceUrl("http://***.***.***")   // 配置服务网站，
                .build();
    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(
                new ApiInfoBuilder()
                        .contact(new Contact("****", "", "****@qq.com"))
                        .title("二手交易网站")
                        .build()
        );
        }

}
