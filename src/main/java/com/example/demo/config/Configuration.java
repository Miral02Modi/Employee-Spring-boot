package com.example.demo.config;

import com.example.demo.dto.Employee;
import com.example.demo.service.IEmployeeService;
import com.example.demo.service.impl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

@org.springframework.context.annotation.Configuration
public class Configuration {

    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(true).
                favorParameter(false).
                ignoreAcceptHeader(false).
                defaultContentType(MediaType.APPLICATION_JSON).
                mediaType("xml", MediaType.APPLICATION_XML).
                mediaType("json", MediaType.APPLICATION_JSON); ;
    }


}
