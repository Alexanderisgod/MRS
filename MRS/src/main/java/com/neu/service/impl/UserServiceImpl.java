package com.neu.service.impl;

import com.neu.model.User;
import com.neu.dao.UserDao;
import com.neu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public int register(User user) {
        return userDao.insert(user);
    }

    @Override
    public int cancelById(long id) {
        return userDao.deleteById(id);
    }

    @Override
    public int login(long id, String password) {
        return 0;
    }

    @Override
    public int updateUserById(User user) {
        return userDao.updateById(user);
    }

    @Override
    public User selectUserById(long id) {
        return userDao.selectById(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDao.selectAllUsers();
    }
}
