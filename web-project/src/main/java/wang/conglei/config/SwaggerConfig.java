package wang.conglei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: springTest
 * @description: Swagger2的配置类
 * @author: conglei.Wang
 * @create: 2018-07-03 23:25
 **/
@EnableSwagger2
@EnableWebMvc
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket getApiInfo() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("wang.conglei.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }

    @Bean
    public ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "springmvc搭建swagger",
                "spring-API swagger测试",
                "v1.0.0",
                "wang.conglei",
                new Contact("congleiwang", "wang.conglei", "congleiwang@qq.com"),
                "web app",
                "My Apps API License URL");
        return apiInfo;


    }
}
