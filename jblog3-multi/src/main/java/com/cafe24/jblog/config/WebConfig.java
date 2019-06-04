package com.cafe24.jblog.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cafe24.config.web.FileuploadConfig;
import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.SecurityConfig;


@Configuration
@ComponentScan({"com.cafe24.jblog.controller","com.cafe24.jblog.exception"})
@Import({MVCConfig.class, SecurityConfig.class,FileuploadConfig.class})
public class WebConfig {
	

}

