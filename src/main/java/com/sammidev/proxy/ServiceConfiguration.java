package com.sammidev.proxy;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public LogInterceptor logInterceptor() {
        return new LogInterceptor();
    }

    @Bean
    public ProxyFactoryBean studentService() {
        ProxyFactoryBean bean = new ProxyFactoryBean();

        bean.setInterfaces(StudentService.class);
        bean.setTarget(new StudentServiceImpl());
        bean.setInterceptorNames("logInterceptor");

        return bean;
    }
}
