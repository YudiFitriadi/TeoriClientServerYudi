/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori.listener;

import com.yudi.Latihan_Teori.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Slf4j
@Component
public class UserListener {

  @EventListener(classes = LoginSuccessEvent.class)
  public void onLoginSuccessEvent(LoginSuccessEvent event){
    log.info("Success login again for user {}", event.getUser());
  }

  @EventListener(classes = LoginSuccessEvent.class)
  public void onLoginSuccessEvent2(LoginSuccessEvent event){
    log.info("Success login again for user {}", event.getUser());
  }

  @EventListener(classes = LoginSuccessEvent.class)
  public void onLoginSuccessEvent3(LoginSuccessEvent event){
    log.info("Success login again for user {}", event.getUser());
  }

}
