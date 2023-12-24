package com.diguage.demo.boot.rest;

import com.diguage.demo.boot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRestController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/{id}")
    public String get(@PathVariable Long id) {
        return userDao.getUserById(id);
    }
}
