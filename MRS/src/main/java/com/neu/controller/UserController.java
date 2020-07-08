package com.neu.controller;

import com.neu.service.impl.UserServiceImpl;
import com.neu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/query")
    public  User selectUserById(long id){
        return userServiceImpl.selectUserById(id);
    }

    @RequestMapping("/find_all")
    public List<User> selectAllUsers(){return userServiceImpl.selectAllUsers();}

}
