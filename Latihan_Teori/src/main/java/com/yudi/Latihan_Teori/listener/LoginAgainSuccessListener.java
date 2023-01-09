/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori.listener;

import com.yudi.Latihan_Teori.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
@Slf4j
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {

  @Override
  public void onApplicationEvent(LoginSuccessEvent event) {
    log.info("Success login again for user {}", event.getUser());
  }
}
