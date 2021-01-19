package com.example.entity;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:39
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String role;
    private String token;
    private String avatar;
    private String description;

    public User() {
        this.role = "user";
        this.description = "我也注册了闪聊，快来和我聊天吧！";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", userName:'" + userName + '\'' +
                ", password:'" + password + '\'' +
                ", role:'" + role + '\'' +
                ", token:'" + token + '\'' +
                ", avatar:'" + avatar + '\'' +
                ", description:'" + description + '\'' +
                '}';
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}