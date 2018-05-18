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
                    inputStream = new FileInputStream(new File("/Users/chenjianliang/IdeaProjects/strut2/upload/中文测试.txt"));
                    fileName = "中文测试.txt";
                    System.out.println("FileDownloadAction2.getDownloadFile "+fileName);
//                    fileName = new String(fileName.getBytes("UTF-8"));
                    fileName = new String(fileName.getBytes("utf-8"),"ISO8859-1");

//                    System.out.println("FileDownloadAction2.getDownloadFile "+fileName);
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
