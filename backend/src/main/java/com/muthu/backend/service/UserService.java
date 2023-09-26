package com.muthu.backend.service;

import com.muthu.backend.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {

  private static List<User> usersList = new ArrayList<>();

  static{
    usersList.add(new User(1, "Muthu", LocalDate.now().minusYears(28)));
    usersList.add(new User(2, "Udhaya", LocalDate.now().minusYears(26)));
    usersList.add(new User(2, "Ajith", LocalDate.now().minusYears(29)));

  }
  
  public List<User> getUsers(){
	  return usersList;
  }

}
