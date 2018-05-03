package com.cjl.www;

import com.cjl.www.bean.User;
import com.cjl.www.exception.NameException;
import com.cjl.www.impl.LoginServiceImpl;
import com.cjl.www.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.omg.CORBA.UserException;

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
    private LoginService loginService = new LoginServiceImpl();

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

        if(loginService.isLogin(name,password)){
            User user = new User();
            user.setUser(name);
            user.setPassword(password);
            System.out.println("RegisterAction.SUCCESS");
            ActionContext.getContext().getSession().put("userInfo",user);
            return SUCCESS;
        }
            System.out.println("RegisterAction.INPUT");
            return INPUT;//语义 用户输入有问题，需要重新输入

//
//        if(!name.equals("hello")){//业务相关
//            throw new NameException("user name invalid");
//        }
//        return SUCCESS;
    }

//    业务不想关
//    @Override
//    public void validate() {
//        super.validate();
//
//        if (null == name || name.length() < 4 || name.length() > 6){
//            this.addActionError("invalid name");
//            this.addFieldError("name","field error-invalid name");
//        }
//
//        if (null == password || password.length() < 4 || password.length() > 6){
//            this.addActionError("invalid password");
//        }
//
//        if(age < 20 || age > 50){
//            this.addActionError("invalid age");
//        }
//
////        this.clearActionErrors();
////        this.clearFieldErrors();
////        this.getActionErrors().clear();
////        this.getFieldErrors().clear();
//        System.out.println("RegisterAction.validate");
//    }
}
