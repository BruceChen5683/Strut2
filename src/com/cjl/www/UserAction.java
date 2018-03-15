package com.cjl.www;

import com.cjl.www.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by chenjianliang on 2018/3/4.
 */
public class UserAction extends ActionSupport{
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {

        System.out.println("UserAction.execute"+user.getPassword());
        return SUCCESS;
    }


}
