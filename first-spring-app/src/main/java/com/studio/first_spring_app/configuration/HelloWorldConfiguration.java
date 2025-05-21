package com.studio.first_spring_app.configuration;

import com.studio.first_spring_app.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    
    public class AppConfig {
        @Bean
        public HelloWorldService helloWorld() {
            return new HelloWorldService();
        }
    }
}
