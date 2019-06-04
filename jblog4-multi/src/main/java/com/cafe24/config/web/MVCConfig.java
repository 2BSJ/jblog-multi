package com.cafe24.config.web;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class MVCConfig extends WebMvcConfigurerAdapter {

	//
	// View Resolver
	//
	
	@Bean
	public ViewResolver viewResolver() { // 뷰 리졸버 설정
	 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	 resolver.setPrefix("/WEB-INF/views/");
	 resolver.setSuffix(".jsp");
	 resolver.setExposeContextBeansAsAttributes(true);
	 
	 return resolver;
	 }


	
	//
	// Default Servlet Handler
	//
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		configurer.enable();
	}

	
	
}
