package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/**
 * Created by chenjianliang on 2018/5/14.
 */
public class FileUploadAction extends ActionSupport{
    private String user;
    private File file;//指向最初保存的临时文件
    private String fileFileName;//file+FileName(固定)   上传的文件名字
    private String fileContentType;//上传文件的类型   固定+ContentType

    public String getUser() {
        System.out.println("FileUploadAction.getUser "+user);
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public File getFile() {
        System.out.println("FileUploadAction.getFile "+file.getPath());
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        System.out.println("FileUploadAction.getFileFileName "+fileFileName);
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        System.out.println("FileUploadAction.getFileContentType "+fileContentType);
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    @Override
    public String execute() throws Exception {
        String root = "/Users/chenjianliang/IdeaProjects/strut2/upload";//ServletActionContext.getRequest().getRealPath("/upload");

//        System.out.println("FileUploadAction.execute  "+ServletActionContext.getRequest().getContextPath());
//        System.out.println("FileUploadAction.execute  "+ServletActionContext.getRequest().getServletPath());

        System.out.println("FileUploadAction.execute "+file.getName());

        InputStream inputStream = new FileInputStream(file);

        OutputStream outputStream = new FileOutputStream(new File(root,fileFileName));
        byte[] buffer = new byte[1024];
        int length = 0;
        while ( -1 != (length = inputStream.read(buffer))){
            outputStream.write(buffer,0,length);
        }
        inputStream.close();
        outputStream.close();

        return SUCCESS;
    }
}
