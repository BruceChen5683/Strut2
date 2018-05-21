package com.cjl.www.json;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.json.annotations.JSON;

/**
 * Created by chenjianliang on 2018/5/21.
 */
public class GetJsonAction2 extends ActionSupport{
    private String name;
    private String homeAddress;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JSON(name = "myAge")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String execute() throws Exception {
        id = 1;
        age = 1001;
        homeAddress ="bj";
        return SUCCESS;
    }
}

