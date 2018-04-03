package com.fku.spring.ioc.ch001;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Setter
@Getter
public class ASimpleIocBean {
    private String url;
    private String username;

    public void doing() {
        System.out.println("url...." + url);
        System.out.println("username...." + username);
    }

}
