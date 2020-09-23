package com.sahith.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;


@SpringBootApplication
public class DemoApplication {
	@Bean
	public OAuth2RestTemplate restTemplate() {
		return new OAuth2RestTemplate(client(), new DefaultOAuth2ClientContext());
	}

	@Bean
	@ConfigurationProperties("client")
	public ClientCredentialsResourceDetails client() {
		return new ClientCredentialsResourceDetails();
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
}
