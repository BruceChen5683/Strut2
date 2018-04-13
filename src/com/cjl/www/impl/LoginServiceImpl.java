package com.cjl.www.impl;

import com.cjl.www.service.LoginService;

/**
 * Created by chenjianliang on 2018/4/13.
 */
public class LoginServiceImpl implements LoginService{
    @Override
    public boolean isLogin(String username, String password) {
        if("hello".equals(username) && "world".equals(password)){
            return true;
        }
        return false;
    }
}
