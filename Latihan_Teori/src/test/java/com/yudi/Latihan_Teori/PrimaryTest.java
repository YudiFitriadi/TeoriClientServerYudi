/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori;

import com.yudi.Latihan_Teori.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author user
 */
public class PrimaryTest {
    
    private ApplicationContext applicationContext;
    
    @BeforeEach
    void setup(){
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }
    
    @Test
    void testGetPrimary(){
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("foo1",Foo.class);
        Foo foo2 = applicationContext.getBean("foo2",Foo.class);
        
        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1, foo2);
    }
}
