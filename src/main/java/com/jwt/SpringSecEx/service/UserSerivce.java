package com.jwt.SpringSecEx.service;

import com.jwt.SpringSecEx.model.Users;
import com.jwt.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserSerivce {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users register(Users users){
        users.setPassword(encoder.encode(users.getPassword()));
        users.setPassword(encoder.encode(users.getPassword()));
        return repo.save(users);
    }
}
