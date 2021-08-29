package org.example.config;

import lombok.RequiredArgsConstructor;
import org.example.config.auth.LoginUserArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final LoginUserArgumentResolver loginUserArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(loginUserArgumentResolver);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/")
                .setCachePeriod(20);
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/")
                .setCachePeriod(20);
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/")
                .setCachePeriod(20);
    }


}
