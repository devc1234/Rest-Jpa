package com.example.spring_rest.controller;


import com.example.spring_rest.model.User;

import com.example.spring_rest.repo.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserJpaRepository userJpaRepository;


    @GetMapping(value = "/all")
   public List<User> findAll(){
        return userJpaRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public User findByName(@PathVariable  String name){
        return UserJpaRepository.findByName(name);
    }
    @PostMapping(value = "/load")
    public User load(@RequestBody final User user){
        userJpaRepository.save(user);
        return userJpaRepository.findbyName(user.getName());
    }
}
