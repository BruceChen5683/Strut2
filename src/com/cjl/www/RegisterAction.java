package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * Created by chenjianliang on 2018/3/15.
 */
public class RegisterAction extends ActionSupport{
    private String name;
    private String password;
    private String repassword;
    private int age;
    private Date birthday;
    private Date graduation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getGraduation() {
        return graduation;
    }

    public void setGraduation(Date graduation) {
        this.graduation = graduation;
    }

    @Override
    public String execute() throws Exception{
        System.out.println("RegisterAction.execute");
        return SUCCESS;
    }

    @Override
    public void validate() {
        super.validate();

        if (null == name || name.length() < 4 || name.length() > 6){
            this.addActionError("invalid name");
            this.addFieldError("name","field error-invalid name");
        }

        if (null == password || password.length() < 4 || password.length() > 6){
            this.addActionError("invalid password");
        }
        System.out.println("RegisterAction.validate");
    }
}
