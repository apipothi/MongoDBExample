package com.apipothi.employee.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact(
				"API POTHI", 
				"https://www.youtube.com/apipothi", 
				"infoapipothi@gmail.com");
	
	  public static final ApiInfo APIPOTHI_DEFAULT = new ApiInfo(
			  "MONGO DB EXAMPLE",
			  "This is Student details Api Documentation", 
			  "2.0", 
			  "urn:tos",
	          DEFAULT_CONTACT, 
	          "WAREHOUSE 1.0", 
	          "https://www.youtube.com/apipothi");
	  
	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(APIPOTHI_DEFAULT);
	}

}
