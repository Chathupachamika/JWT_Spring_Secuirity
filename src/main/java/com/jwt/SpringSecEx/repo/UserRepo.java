package com.jwt.SpringSecEx.repo;

import com.jwt.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <Users, Integer>{
}
