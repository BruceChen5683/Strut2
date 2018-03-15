package com.cjl.www;

import java.util.Date;

/**
 * Created by chenjianliang on 2018/3/1.
 */
public class LoginAction {
    private String username;
    private String password;
    private int age;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String execute() throws Exception{
        return "success";
    }

    public String myExecute() throws Exception{
        System.out.println("LoginAction.myExecute");
        return "success";
    }
}
