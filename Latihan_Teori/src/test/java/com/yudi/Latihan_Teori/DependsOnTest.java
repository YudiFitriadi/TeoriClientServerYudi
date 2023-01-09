/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori;

import com.yudi.Latihan_Teori.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author user
 */
public class DependsOnTest {
    
    private ApplicationContext applicationContext;
    
    @BeforeEach
    void setup(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }
    
    @Test
    void testDependsOn(){
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
