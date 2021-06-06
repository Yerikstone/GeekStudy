package com.geek.code.class9.xml;

import org.springframework.stereotype.Component;

/**
 * xml方式，Bean装配
 * @author syh
 */
@Component
public class XmlExample {
    public XmlExample() {
        System.out.println("Construct Example");
    }

    public void info() {
        System.out.println("Auto wiring example");
    }
}
