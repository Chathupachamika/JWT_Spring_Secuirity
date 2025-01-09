package com.jwt.SpringSecEx.service;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JWTService {
    public String generateToken() {
        Map<String, Object> claims= new HashMap<>();

        return Jwts 
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkNoYXRodXBhIiwiaWF0IjoxNTE2MjM5MDIyLCJleHAiOjE1MTYyNDkwMjJ9.Se_I1HznsJzx0BFAdbZzFyUHT9QNpW4vp5QMgRZyWmk";
    }
}
