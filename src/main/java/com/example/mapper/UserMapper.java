package com.example.mapper;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Login(String userName,String password);
    User SaveMsg(String userName,String password,String role,String avatar,String description);
    List<User> SelectAllUser();

    Void SaveToken(String userName,String token);
}