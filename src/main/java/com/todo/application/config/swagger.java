package com.todo.application.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.ModelRendering;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan("com.todo.application")
public class swagger {
	 @Bean
	    public Docket api(){
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any())
	                .build();
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfo(
	                "TODO Api ",
	                "This is TODO API",
	                "API TODO",
	                "",
	                new Contact("Vaibhav Kaushik", "https://www.kotak.com/en.html", ""),
	                "",
	                "",
	                Collections.emptyList());
	    }

	    @Bean
	    UiConfiguration uiConfig() {
	        return UiConfigurationBuilder.builder()
	                .deepLinking(true)
	                .displayOperationId(false)
	                .defaultModelsExpandDepth(1)
	                .defaultModelExpandDepth(1)
	                .defaultModelRendering(ModelRendering.EXAMPLE)
	                .displayRequestDuration(false)
	                .docExpansion(DocExpansion.NONE)
	                .filter(false)
	                .maxDisplayedTags(null)
	                .operationsSorter(OperationsSorter.ALPHA)
	                .showExtensions(false)
	                .tagsSorter(TagsSorter.ALPHA)
	                .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
	                .validatorUrl(null)
	                .build();
	    }
}
