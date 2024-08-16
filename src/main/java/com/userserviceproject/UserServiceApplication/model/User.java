package com.userserviceproject.UserServiceApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_detail_info")
public class User {

    @Id
    private String userId;
    private String username;
    private String password;
    private String active;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public User() {
    }

    public User(String userId, String username, String password, String active) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.active = active;
    }


}