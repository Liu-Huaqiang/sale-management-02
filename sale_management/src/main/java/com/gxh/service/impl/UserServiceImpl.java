package com.gxh.service.impl;

import com.gxh.bean.User;
import com.gxh.mapper.UserMapper;
import com.gxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkLogin(User user) {
        return userMapper.findUserByUsernameAndPassword(user);
    }

    @Override
    public Boolean checkUserByUsername(User user) {
        Integer howMany = userMapper.findUserByUsername(user);
        if (howMany > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void registerNewUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUserInfo(User user) {
        userMapper.updateUserByUsername(user);
    }
}
