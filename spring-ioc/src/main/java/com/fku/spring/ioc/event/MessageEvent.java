package com.fku.spring.ioc.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;


@Getter
@Setter
public class MessageEvent extends ApplicationEvent {
    private String msg;
    public MessageEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
}
