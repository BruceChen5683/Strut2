package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;

import java.io.InputStream;

/**
 * Created by chenjianliang on 2018/5/16.
 */
public class FileDownLoadAction extends ActionSupport {
    public InputStream getDownloadFile(){

    }


    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
