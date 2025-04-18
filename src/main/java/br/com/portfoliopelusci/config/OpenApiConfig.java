package br.com.portfoliopelusci.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI custonOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Teste meetime")
						.version("v1")
						.description("Some description about your API")
						.termsOfService("1")
						.license(new License().name("Apache 2.0")
								.url("2")));
	}
}
