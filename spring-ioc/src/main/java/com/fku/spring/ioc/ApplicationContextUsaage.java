package com.fku.spring.ioc;

import com.fku.spring.ioc.ch001.ASimpleIocBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationContextUsaage {
    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("classpath:xmlBeanFactory.xml");
        ASimpleIocBean sb = ctxt.getBean("simple", ASimpleIocBean.class);
        sb.doing();
    }
}
