package com.fku.spring.ioc.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("config")
public class AnnotationConfig {
    private String url;
    @Value("name")
    private String username;

    public void doing() {
        System.out.println("url...." + url);
        System.out.println("username...." + username);
    }

    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("classpath:di/annotation-config.xml");
        AnnotationConfig sb = ctxt.getBean("config", AnnotationConfig.class);
        sb.doing();
    }
}

