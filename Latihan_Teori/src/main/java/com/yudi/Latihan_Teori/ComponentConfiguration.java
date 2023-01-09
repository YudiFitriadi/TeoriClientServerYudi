/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori;

import com.yudi.Latihan_Teori.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author user
 */
@Configuration
@ComponentScan(basePackages = {
    "com.yudi.Latihan_Teori.repository",
    "com.yudi.Latihan_Teori.service",
    "com.yudi.Latihan_Teori.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
    
}
