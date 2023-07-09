package com.paymaven.api.paymaven.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paymaven.api.paymaven.models.User;
import com.paymaven.api.paymaven.repositories.UserRepository;


@Service
public class UserService {
  
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
