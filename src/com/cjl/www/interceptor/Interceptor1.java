package com.cjl.www.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by chenjianliang on 2018/4/27.
 */
public class Interceptor1 implements Interceptor{
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        System.out.println("Interceptor1.setTest");
        this.test = test;
    }

    @Override
    public void destroy() {
        System.out.println("Interceptor1.destroy");
    }

    @Override
    public void init() {
        System.out.println("Interceptor1.init"+test);
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("Interceptor1.intercept before");

        String result = actionInvocation.invoke();

        System.out.println("Interceptor1.intercept after");
        return result;
    }
}
