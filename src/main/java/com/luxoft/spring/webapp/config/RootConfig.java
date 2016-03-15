package com.luxoft.spring.webapp.config;

import com.luxoft.spring.webapp.utils.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
@ComponentScan(basePackages = "com.luxoft.spring.webapp",
    excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {

    @Bean
    public Logger logger() {
        return Logger.getInstance();
    }

}
