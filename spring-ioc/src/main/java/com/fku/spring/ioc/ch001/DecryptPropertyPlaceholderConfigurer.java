package com.fku.spring.ioc.ch001;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Base64;

public class DecryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    public  DecryptPropertyPlaceholderConfigurer(){
        super();
    }

    protected String convertProperty(String propertyName, String propertyValue) {
        if(propertyName.equalsIgnoreCase("passwd")){
            return new String(Base64.getDecoder().decode(propertyValue));
        }
        return convertPropertyValue(propertyValue);
    }
}
