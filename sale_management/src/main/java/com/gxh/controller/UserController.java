package com.gxh.controller;

import com.gxh.bean.Result;
import com.gxh.bean.User;
import com.gxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/user")
    public Result updateUserInfo(@RequestBody User user) {
        userService.updateUserInfo(user);
        return Result.success();
    }

    @PostMapping("/login")
    public Result loginCheck(@RequestBody User user) {
        User res = userService.checkLogin(user);
        if (res != null) {
            return Result.success(res);
        }
        else {
            return Result.error("NOT_LOGIN");
        }
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        Boolean had = userService.checkUserByUsername(user);
        if (had) {
            return Result.error("该用户名已被注册");
        }
        else {
            userService.registerNewUser(user);
            return Result.success();
        }
//        if (user.getUsername().equals("小刚")) {
//            return Result.error("该用户名已被注册");
//        }
//        else {
//            return Result.success();
//        }
    }

}
