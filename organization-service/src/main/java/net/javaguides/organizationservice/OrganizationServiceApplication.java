package net.javaguides.organizationservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@OpenAPIDefinition(

		info = @Info(title = "Organization Service Rest API ",
				description = "Organization Service api doc",
				version = "v1.0",
				contact = @Contact(
						name = "Akanksha",
						email = "imakankshamnk@gmail.com",
						url = "www.javaguide.net"
				),
				license = @License(
						name = "Apace 2.0",
						url = "www.youtube.com"
				)),
		externalDocs = @ExternalDocumentation(
				description = "Organization service ",
				url = "javaguide.net/organization-service.html"
		)
)
@SpringBootApplication
//@EnableEurekaClient
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
