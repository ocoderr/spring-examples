package com.fku.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.io.IOException;


public class LoadResource {
    public static void main(String[] args) throws IOException {
//        ApplicationContext ctxt = new ClassPathXmlApplicationContext("lifecycle/lifecycle.xml");
//        Resource resource =   ctxt.getResource("classpath:test.txt");
//        System.out.println(resource.getClass());
//        System.out.println(resource.getURL().getContent());
        PathMatcher pathMatcher = new AntPathMatcher();
        System.out.println(pathMatcher.match("com.fku.**","com.fku.spring.ioc.LoadResource"));

    }
}
