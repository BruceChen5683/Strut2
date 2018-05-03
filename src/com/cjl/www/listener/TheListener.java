package com.cjl.www.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 * Created by chenjianliang on 2018/4/28.
 */
public class TheListener implements PreResultListener{
    @Override
    public void beforeResult(ActionInvocation actionInvocation, String s) {
        System.out.println("TheListener.beforeResult  code:  "+s);
    }
}
