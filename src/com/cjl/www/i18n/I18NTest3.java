package com.cjl.www.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by chenjianliang on 2018/4/9.
 */
public class I18NTest3 {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        ResourceBundle resourceBundle = ResourceBundle.getBundle("battle",locale);
        String value = resourceBundle.getString("name");
        System.out.println("I18NTest3.main "+value);
        System.out.println("I18NTest3.main  "+ MessageFormat.format(value,new Object[]{"hhh"}));

    }
}
