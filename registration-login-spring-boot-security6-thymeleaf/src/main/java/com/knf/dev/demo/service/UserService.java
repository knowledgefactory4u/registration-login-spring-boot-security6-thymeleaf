package com.knf.dev.demo.service;

import com.knf.dev.demo.dto.UserRegistrationDto;
import com.knf.dev.demo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
   
   User save(UserRegistrationDto registrationDto);
   List<User> getAll();
}