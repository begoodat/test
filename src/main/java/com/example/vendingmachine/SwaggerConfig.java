package com.example.vendingmachine;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)

                // JWT 인증을 위한 헤더 입력 가능 설정.
                .globalOperationParameters(Arrays.asList(
                        new ParameterBuilder()
                                .name("Authorization")
                                .defaultValue("test")
                                .description("ticket")
                                .parameterType("header")
                                .modelRef(new ModelRef("string"))
                                .build()
                ))

                .select()
                .apis(RequestHandlerSelectors.any())

                // error.* 제외. 스프링에서 기본 설정된것.
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                // test 패스 제외.
                // .paths(Predicates.not(PathSelectors.regex("/test.*")))

                .build();
    }
}
