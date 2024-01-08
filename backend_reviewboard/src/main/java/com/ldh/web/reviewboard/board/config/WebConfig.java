package com.ldh.web.reviewboard.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* 글로벌 CORS 설정 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
//		WebMvcConfigurer.super.addCorsMappings(registry);
		registry.addMapping("/**")
//			.allowedOrigins("*")
			.allowedOrigins("http://localhost:3000", "http://localhost:8080")
			.allowedHeaders("*")
			.allowedMethods("*")
//			.allowCredentials(true)
			.maxAge(5000);
	}
}
