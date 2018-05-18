package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by chenjianliang on 2018/5/18.
 */
public class FileDownloadAction2 extends ActionSupport {

    private int number;

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public InputStream getDownloadFile(){
        FileInputStream inputStream = null;
        try {
            switch (number){
                case 1:
                    inputStream = new FileInputStream(new File("/Users/chenjianliang/IdeaProjects/strut2/upload/FAQ"));
                    fileName = "FAQ";
                    break;
                case 2:
                    inputStream = new FileInputStream(new File("/Users/chenjianliang/IdeaProjects/strut2/upload/pw.txt"));
                    fileName = "pw.txt";
                    break;
                case 3:
                    inputStream = new FileInputStream(new File("/Users/chenjianliang/IdeaProjects/strut2/upload/setNet.png"));
                    fileName = "setNet.png";
                    break;
                default:
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return inputStream;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
