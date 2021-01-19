package com.example.controller;

import com.example.entity.Desc;
import com.example.entity.Response;
import com.example.entity.User;
import com.example.service.DescService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DescService descService;

    //@PathVariable int id
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Response Login(@RequestBody User user) {
        User loginUser = userService.Login(user.getUserName(), user.getPassword());
        System.out.println(loginUser + "," + user.getUserName() + "," + user.getPassword());
        if (loginUser != null) {
            String token = new Date().toString() + ":993";
            userService.SaveToken(user.getUserName(), token);
            loginUser.setToken(token);
            System.out.println("登录成功:" + loginUser + ",token:" + token);
            return new Response(200, loginUser, "登录成功");
        } else {
            System.out.println("该用户不存在:" + user.getUserName());
            return new Response(100, null, "用户名或密码不正确");
        }
    }

    @RequestMapping(value = "saveMsg", method = RequestMethod.POST)
    public Response SaveMsg(@RequestBody User user) {
        List<User> users = userService.SelectAllUser();
        List<User> usersExit = users.stream().filter(u -> u.getUserName().equals(user.getUserName())).collect(Collectors.toList());
        if (usersExit.isEmpty()) {
            userService.SaveMsg(user.getUserName(), user.getPassword(), user.getRole(), user.getUserName().substring(0, 1), user.getDescription());
            System.out.println("成功创建用户:" + user);
            users = userService.SelectAllUser();
            // 注册成功后将该用户的description设置
            descService.SaveDesc(users.get(users.size()-1).getId(), null, null, null, new Date().getTime()+"",user.getDescription());
            return new Response(200, null, "注册成功");
        } else {
            System.out.println("已存在users:" + users);
            return new Response(100, null, "用户名已存在");
        }
    }

    @RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
    public Response GetAllUsers(String myId) {
        List<User> users = userService.SelectAllUser();
        System.out.println("所有users:" + users);
        List<Desc> msgs = descService.GetMsgsInitDesc(myId);
        // 更新所有用户对应的最新description
        for (User user : users) {
            for (Desc desc : msgs) {
                if (user.getId().equals(desc.getYouId()))
                    user.setDescription(desc.getYouMsg() != null ? desc.getYouMsg() : desc.getMyMsg());
            }
        }
        System.out.println("更新description后的所有users:" + users);
        return new Response(200, users, "查找成功");

    }
}