package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by chenjianliang on 2018/4/23.
 */
public class Action2 extends ActionSupport{
    private String username;

    private String password;

    private String up;


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

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
