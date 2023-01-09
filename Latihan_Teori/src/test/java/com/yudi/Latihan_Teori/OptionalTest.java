/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori;

import com.yudi.Latihan_Teori.data.Foo;
import com.yudi.Latihan_Teori.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author user
 */
public class OptionalTest {
    
    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        applicationContext.registerShutdownHook();
    }
    
    @Test
    void testOptional(){
        Foo foo = applicationContext.getBean(Foo.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);
        
        Assertions.assertNull(fooBar.getBar());
        Assertions.assertSame(foo, fooBar.getFoo());
    }
}