package me.dio.sacola.configuration;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@Api(value="//ifood-devweek/sacolas")
@RestController
@RequestMapping("//ifood-devweek/sacolas")
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket getBean() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.regex("/ifood-devweek/.*"))
                .build()
                .apiInfo(getInfo());
    }
    private ApiInfo getInfo() {
        return new ApiInfoBuilder()
                .title("Sacola API")
                .description("Sacola API para Servir uma Aplicação de Delivery")
                .build();
    }
}
