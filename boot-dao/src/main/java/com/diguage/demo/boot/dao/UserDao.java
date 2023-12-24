package com.diguage.demo.boot.dao;


import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUserById(Long id) {
        return "user-" + id;
    }
}
