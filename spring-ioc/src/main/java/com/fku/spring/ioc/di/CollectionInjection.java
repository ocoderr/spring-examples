package com.fku.spring.ioc.di;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Setter
@Getter
public class CollectionInjection {
    private Map<String, Object> map;
    private Properties props;
    private Set set;
    private List list;

    public void displayInfo() {
        // display the Map
        System.out.println("Map contents:");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        // display the properties
        System.out.println("\nProperties contents:");
        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        // display the set
        System.out.println("\nSet contents:");
        for (Object obj : set) {
            System.out.println("Value: " + obj);
        }
        // display the list
        System.out.println("\nList contents:");
        for (Object obj : list) {
            System.out.println("Value: " + obj);
        }
    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/collection-injection.xml");
        CollectionInjection con = (CollectionInjection) context.getBean("collection");
        con.displayInfo();
    }
}
