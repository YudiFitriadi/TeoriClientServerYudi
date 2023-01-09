/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodingan.spring.core.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class UserService implements ApplicationEventPublisherAware {

  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  public boolean login(String username, String password){
    if(isLoginSuccess(username, password)){
      applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
      return true;
    }else{
      return false;
    }
  }

  private boolean isLoginSuccess(String username, String password) {
    return "eko".equals(username) && "eko".equals(password);
  }
}
