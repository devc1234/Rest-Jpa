package com.example.spring_rest.repo;

import com.example.spring_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserJpaRepository extends JpaRepository<User,Long> {
    static User findByName(String name) {
        return null;
    }

    User findbyName(String name);
}
