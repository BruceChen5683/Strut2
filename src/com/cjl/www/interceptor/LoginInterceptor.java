package com.cjl.www.interceptor;

import com.cjl.www.RegisterAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by chenjianliang on 2018/4/28.
 */
public class LoginInterceptor extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        if(actionInvocation.getAction() instanceof RegisterAction){
            return actionInvocation.invoke();
        }

        Map map = actionInvocation.getInvocationContext().getSession();
        if(null == map.get("userInfo")){
            return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
