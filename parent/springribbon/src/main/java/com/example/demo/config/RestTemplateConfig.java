package com.example.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
  
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		    HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
	        httpRequestFactory.setConnectionRequestTimeout(3000);
	        httpRequestFactory.setConnectTimeout(3000);
	        httpRequestFactory.setReadTimeout(3000);
	        return new RestTemplate(httpRequestFactory);
    }
}
