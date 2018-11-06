package com.cjl.www.ognl;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenjianliang on 2018/6/25.
 */
public class OnglAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

    private String username;
    private String password;

    private Map<String,Object> requestMap;
    private Map<String,Object> sessionMap;
    private Map<String,Object> applicationMap;

    private List<Person> list;

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
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
    public void setRequest(Map<String, Object> request) {
        System.out.println("OnglAction.setRequest");
        if(request == null){
            System.out.println("OnglAction.setRequest null");
        }
        this.requestMap = request;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.applicationMap = application;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.sessionMap = session;
    }

    @Override
    public String execute() throws Exception {

        Thread.sleep(20000);

        requestMap.put("hello","world");
        sessionMap.put("hello","hello");
        applicationMap.put("hello","hello world");


        Cat cat1 = new Cat("cat1",2,"red");
        Cat cat2 = new Cat("cat2",22,"black");

        String[] friends1 = {"111","2222","33"};
        String[] friends2 = {"aaa","bbbbb","cccc"};

        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        map1.put("m1","none1");
        map1.put("m11","ddd1");
        map2.put("m2","dddada2");
        map2.put("m22","dddada22");
        map2.put("m22","dddada22");


        Person person1 = new Person("person1",55,"sh",friends1,cat1,map1);
        Person person2 = new Person("person2",32,"Beijinhg",friends2,cat2,map2);
        list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        return SUCCESS;
    }
}
