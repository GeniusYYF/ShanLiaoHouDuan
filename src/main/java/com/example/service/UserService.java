package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Login(String userName, String password) {
        return userMapper.Login(userName, password);
    }

    public User SaveMsg(String userName, String password, String role, String avatar, String description) {
        return userMapper.SaveMsg(userName, password, role, avatar, description);
    }

    public List<User> SelectAllUser() {
        return userMapper.SelectAllUser();
    }

    public Void SaveToken(String userName, String token) {
        return userMapper.SaveToken(userName, token);
    }
}