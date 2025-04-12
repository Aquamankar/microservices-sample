package net.javaguides.employeeservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@OpenAPIDefinition(

		info = @Info(title = " Employee Service Rest API ",
				description = " Employee Service api documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Akanksha",
						email = "imakankshamnk@gmail.com",
						url = "javaguides.net"
				),
				license = @License(
						name = "Apace 2.0",
						url = "www.youtube.com"
				)),
		externalDocs = @ExternalDocumentation(
				description = " Employee service ",
				url = "www.youtube.com"
		)
)
@SpringBootApplication
@EnableFeignClients
//@EnableEurekaClient
public class EmployeeServiceApplication {

//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
