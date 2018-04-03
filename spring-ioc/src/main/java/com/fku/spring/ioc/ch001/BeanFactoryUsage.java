package com.fku.spring.ioc.ch001;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.lang.Nullable;
import org.springframework.util.PropertyPlaceholderHelper;

import java.io.InputStreamReader;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class BeanFactoryUsage {
    public static void main(String[] args) {
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(new ClassPathResource("com.fku.spring.ioc.ch001/xmlBeanFactory.xml"));
//        PropertyPlaceholderConfigurer propertyPostProcessor = new DecryptPropertyPlaceholderConfigurer();
//        propertyPostProcessor.setLocation(new ClassPathResource("com.fku.spring.ioc.ch001/replace.propertise"));
//        propertyPostProcessor.setFileEncoding("UTF-8");
//        // 执行后处理操作
//        propertyPostProcessor.postProcessBeanFactory(factory);
//        ASimpleIocBean bean = (ASimpleIocBean) factory.getBean("simple");
//        bean.doing();
        Properties properties = new Properties();
        properties.setProperty("name", "fk");
        PropertyPlaceholderHelper propertyPlaceholderHelper = new PropertyPlaceholderHelper("${", "}", ":",
                true);
        String a = propertyPlaceholderHelper.replacePlaceholders("${name}ss", new CutomerPlaceholderConfigurerResolver());


        System.out.println(a);


    }

    private static class CutomerPlaceholderConfigurerResolver implements PropertyPlaceholderHelper.PlaceholderResolver {

        private final Map<String, String> props;

        private CutomerPlaceholderConfigurerResolver() {
            props = new HashMap();
            props.put("name", "map");
        }

        @Override
        @Nullable
        public String resolvePlaceholder(String placeholderName) {
            return props.get(placeholderName);
        }
    }

}

