/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori.configuration;

import com.yudi.Latihan_Teori.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author user
 */
@Configuration
public class FooConfiguration {
    
    @Bean
    @Primary
    public Foo foo(){
        return new Foo();
    }
    
    @Bean
    public Foo foo2(){
        return new Foo();
    }
    
    @Bean
    public Foo foo3(){
        return new Foo();
    }
}
