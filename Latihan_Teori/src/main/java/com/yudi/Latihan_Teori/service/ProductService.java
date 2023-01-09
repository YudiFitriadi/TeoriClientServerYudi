/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori.service;

import com.yudi.Latihan_Teori.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class ProductService {
    
    @Getter
    private ProductRepository productRepository;
    
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    
    public ProductService(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
