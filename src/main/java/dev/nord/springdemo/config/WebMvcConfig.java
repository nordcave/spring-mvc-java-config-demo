package dev.nord.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("dev.nord.springdemo")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

}
