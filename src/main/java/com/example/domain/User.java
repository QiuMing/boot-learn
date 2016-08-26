package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ming on 2016/8/24.
 */
@Entity
public class User {

    @Id
    @Column
    private Integer userId;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String password;

    public User() {
        super();
    }

    public User(Integer userId, String phone, String password) {
        super();
        this.userId = userId;
        this.phone = phone;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
