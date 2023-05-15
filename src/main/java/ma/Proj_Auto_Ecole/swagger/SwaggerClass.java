package ma.Proj_Auto_Ecole.swagger;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerClass {

    @Bean
    public Docket api()
    {
        return  new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors
                .basePackage("ma.Proj_Auto_Ecole.Controllers")).build();
    }
}
