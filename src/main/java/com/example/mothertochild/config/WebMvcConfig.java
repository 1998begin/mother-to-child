package com.example.mothertochild.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


/**
 * 配置静态资源映射
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有/static/** 访问都映射到classpath:/static/ 目录下
       // registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/images/**").addResourceLocations("file:///F:/Projects/Images/mother-to-child/static/images/");
//        registry.addResourceHandler("/static/**").addResourceLocations("F:/Project/Images/mother-to-child/static/");
        System.out.println("资源映射");
    }

}