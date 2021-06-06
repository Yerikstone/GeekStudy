package com.geek.code.class9.auto;

import org.springframework.stereotype.Component;

/**
 * 自动注解方式，Bean装配
 * @author syh
 */
@Component
public class AutoWiringExample {
    public AutoWiringExample() {
        System.out.println("Construct Example");
    }

    public void info() {
        System.out.println("自动装配 example");
    }
}
