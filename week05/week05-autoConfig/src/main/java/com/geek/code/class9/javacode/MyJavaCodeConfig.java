package com.geek.code.class9.javacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author syh
 */
@Configuration
public class MyJavaCodeConfig {

    @Bean
    public MyJavaCodeExample javaCodeExample() {
        return new MyJavaCodeExample();
    }
}
