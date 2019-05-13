package cn.rjguanwen.booklib;

import org.springframework.beans.factory.annotation.Value;
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
 * @ClassName: SwaggerConfig
 * @Description: Swagger配置文件
 * @Author: 郑斌
 * @Date: 2019/5/9 13:57
 **/
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    // 是否开启swagger
    @Value(value = "${swagger.enabled}")
    Boolean swaggerEnable;

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                // 是否开启
                .enable(swaggerEnable).select()
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("cn.rjguanwen.booklib"))
                // 制指定径处理
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("图书共享API：")
                .description("guanwen | 关文")
                .contact(new Contact("rjguanwen", "http://rjguanwen.cn", "rjguanwen001@163.com"))
                .version("1.0.0")
                .build();
    }
}
