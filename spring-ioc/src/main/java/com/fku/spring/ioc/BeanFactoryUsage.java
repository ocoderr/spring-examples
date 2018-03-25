package com.fku.spring.ioc;

import com.fku.spring.ioc.ch001.ASimpleIocBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;


public class BeanFactoryUsage {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("com.fku.spring.ioc.ch001/xmlBeanFactory.xml"));
        ASimpleIocBean bean = (ASimpleIocBean) factory.getBean("simple");
        bean.doing();
    }
}

