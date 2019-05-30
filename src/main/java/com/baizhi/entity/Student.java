package com.baizhi.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private Integer id;
    private String username;
    private String password;
    private Date bir;

    public Student() {
    }

    public Student(Integer id, String username, String password, Date bir) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.bir = bir;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }
}
