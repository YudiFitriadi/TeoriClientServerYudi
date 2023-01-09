/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori.event;

import lombok.Getter;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationEvent;

/**
 *
 * @author user
 */
public class LoginSuccessEvent extends ApplicationEvent {

  @Getter
  private final User user;

  public LoginSuccessEvent(User user){
    super(user);
    this.user = user;
  }

}
