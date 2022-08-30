package com.movimentomanual.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport{
	@Bean
	public Docket productApi() {
	return new Docket(DocumentationType.SWAGGER_2)
	.select()
	.apis(RequestHandlerSelectors.basePackage("com.movimentomanual"))
	.build()
	.apiInfo(metaData());

	}

	private ApiInfo metaData() {
		 ApiInfo apiInfo = new ApiInfo(
	                "Agenda de Consulta",
	                "Agendamento de Consultas",
	                "1.0",
	                "API PUBLICA",
	                new Contact("Cleiton Silva", "https://www.linkedin.com/in/cleiton-silva-b08535101/",
	                        "cleitonmoc02@gmail.com"),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
	        );

	        return apiInfo;

	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("swagger-ui.html")
	.addResourceLocations("classpath:/META-INF/resources/");

	registry.addResourceHandler("/webjars/**")
	.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
