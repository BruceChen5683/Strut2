package com.cjl.www.interceptor;

import com.cjl.www.listener.TheListener;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 * Created by chenjianliang on 2018/4/28.
 */
public class Interceptor3  extends MethodFilterInterceptor{
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {

        actionInvocation.addPreResultListener(new TheListener());

        System.out.println("before Interceptor3.doIntercept");
        String reusult = actionInvocation.invoke();
        System.out.println("after Interceptor3.doIntercept");
        return reusult;
    }
}
