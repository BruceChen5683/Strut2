package com.cjl.www.converter;

import com.cjl.www.bean.User;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by chenjianliang on 2018/3/10.
 */
public class UserConverter2 extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        String firstValue = strings[0];
        StringTokenizer st = new StringTokenizer(firstValue,";");
        User user = new User();
        user.setUser(st.nextToken());
        user.setPassword(st.nextToken());
        return user;
    }

    @Override
    public String convertToString(Map map, Object o) {
        User user = (User) o;
        return user.getUser()+";"+user.getPassword();
    }
}
