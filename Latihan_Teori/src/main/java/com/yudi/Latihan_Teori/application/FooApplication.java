/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori.application;

import com.yudi.Latihan_Teori.data.Foo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author user
 */
@SpringBootApplication
public class FooApplication {

  @Bean
  public Foo foo(){
    return new Foo();
  }

//  public static void main(String[] args) {
//    ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);

//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println(foo);
//  }

//  public static void main(String[] args) {
//    SpringApplication application = new SpringApplication(FooApplication.class);
//    application.setBannerMode(Banner.Mode.OFF);
//    application.setListeners(List.of(new AppStartingListener()));

//    ConfigurableApplicationContext applicationContext = application.run(args);

//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println(foo);
//  }

}
