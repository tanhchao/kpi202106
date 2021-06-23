package com.example.kpi202106demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 谭红超
 * @Description:
 * @since 2021-06-22 10:45
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "swagger.enabled", havingValue = "true")
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("学习springboot框架整合")
                .apiInfo(restApiInfo())
                .select()
                // 指定包名
                .apis(RequestHandlerSelectors.basePackage("com.example.kpi202106demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo restApiInfo() {

        Contact contact = new Contact("tanhongchao", "", "");

        return new ApiInfoBuilder()
                .title("springboot利用swagger2构建api文档")
                .description("简单优雅的restful风格")
                .contact(contact)
                .termsOfServiceUrl("no terms of serviceUrl")
                .version("1.0")
                .build();
    }
}
