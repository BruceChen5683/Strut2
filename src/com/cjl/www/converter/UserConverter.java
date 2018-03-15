package com.cjl.www.converter;

import com.cjl.www.bean.User;
import ognl.DefaultTypeConverter;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by chenjianliang on 2018/3/4.
 */
public class UserConverter extends DefaultTypeConverter{
    @Override
    public Object convertValue(Map context, Object value, Class toType) {

        if(User.class == toType){//页面to后台
            String[] str = (String[]) value;
            String firstValue = str[0];
            StringTokenizer st = new StringTokenizer(firstValue,";");
            User user = new User();
            user.setUser(st.nextToken());
            user.setPassword(st.nextToken());
            return user;
        }else if(String.class == toType){//从后台to页面
            User user = (User) value;
            return user.getUser()+";"+user.getPassword();
        }
        return null;
    }
}
