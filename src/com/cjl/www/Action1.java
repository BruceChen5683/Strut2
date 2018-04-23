package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by chenjianliang on 2018/4/23.
 */
public class Action1 extends ActionSupport{

    private String username;

    private String password;

    private String up;

    public String getUp(){
        return up;
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

    @Override
    public String execute() throws Exception {
        up = this.username+this.password;
        return SUCCESS;
    }
}
