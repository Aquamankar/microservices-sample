package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//http://localhost:8080/swagger-ui/index.html
@OpenAPIDefinition(

		info = @Info(title = "Department Service Rest API ",
		description = "department Service api doc",
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
				description = "department service ",
				url = "www.youtube.com"
		)
)
@SpringBootApplication
//@EnableEurekaClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
