package com.cjl.www.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by chenjianliang on 2018/3/28.
 */
public class I18NTest1 {
    public static void main(String[] args) {
        for ( Locale locale :Locale.getAvailableLocales()){
            System.out.println("I18NTest1.main   "+ locale.getCountry()+":"+locale.getDisplayCountry());

            System.out.println("I18NTest1.main   "+locale.getLanguage()+":"+locale.getDisplayLanguage());

        }
    }
}
