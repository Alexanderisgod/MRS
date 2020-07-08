package com.neu.service;

import com.neu.model.User;

import java.util.List;

public interface UserService {
   int register(User user);         //注册

   int cancelById(long id);         //注销

   int login(long id, String password);   //登录

   int updateUserById(User user);   //修改用户信息

   User selectUserById(long id);    //用户ID读取用户信息

   List<User> selectAllUsers();
}
