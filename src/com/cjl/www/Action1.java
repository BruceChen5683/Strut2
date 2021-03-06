package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by chenjianliang on 2018/4/23.
 */
@Action(value = "action1",results = @Result(name = "success",location = "/error.jsp"))
public class Action1 extends ActionSupport{

    private String username;

    private String password;

    private String up;

    public String getUp(){
        System.out.println("Action1.getUp");
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
        System.out.println("Action1.execute");
        up = this.username+this.password;
        return SUCCESS;
    }

    public String myExecute() throws Exception{
        System.out.println("Action1.myExecute");
        return SUCCESS;
    }
}
