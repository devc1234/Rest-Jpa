package com.example.spring_rest.controller;


import com.example.spring_rest.model.User;
import com.example.spring_rest.repo.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserJpaRepository userJpaRepository;


    @GetMapping("/user")
    public List<User> findAll(){
        userJpaRepository.findAll();


        @GetMapping(value = "/{name}")
         public  User findByName(@PathVariable final String name)    {
            return  userJpaRepository find
        }


    }
}
