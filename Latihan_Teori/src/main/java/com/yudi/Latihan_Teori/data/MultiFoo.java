/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori.data;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class MultiFoo {
    
    @Getter
    private List<Foo> foos;
    
    public MultiFoo(ObjectProvider<Foo> objectProvider){
        foos = objectProvider.stream().collect(Collectors.toList());
    }
}
