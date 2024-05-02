package com.gxh.service;

import com.gxh.bean.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User checkLogin(User user);

    Boolean checkUserByUsername(User user);

    void registerNewUser(User user);

    void updateUserInfo(User user);
}
