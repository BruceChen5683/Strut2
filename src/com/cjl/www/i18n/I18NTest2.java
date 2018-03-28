package com.cjl.www.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by chenjianliang on 2018/3/28.
 */
public class I18NTest2 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("battle",new Locale("en","US"));
        System.out.println("I18NTest2.main"+bundle.getString("name"));
//        System.out.println("I18NTest2.main "+ locale.get);
    }
}
