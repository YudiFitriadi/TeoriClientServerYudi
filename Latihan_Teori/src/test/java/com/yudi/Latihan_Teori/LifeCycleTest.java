/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori;

import com.yudi.Latihan_Teori.data.Connection;
import com.yudi.Latihan_Teori.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author user
 */
public class LifeCycleTest {
    
    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }
    
    @AfterEach
    void tearDown(){
        //applicationContext.close();
    }
    
    @Test
    void testConnection(){
        
        Connection connection = applicationContext.getBean(Connection.class);
    }
    
    @Test
    void testServer(){
        Server server = applicationContext.getBean(Server.class);
    }
}