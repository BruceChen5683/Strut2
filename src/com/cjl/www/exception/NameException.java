package com.cjl.www.exception;

/**
 * Created by chenjianliang on 2018/4/11.
 */
public class NameException extends Exception{
    private String message;

    public NameException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
