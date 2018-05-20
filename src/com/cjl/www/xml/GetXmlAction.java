package com.cjl.www.xml;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.w3c.dom.Document;

import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Created by chenjianliang on 2018/5/20.
 */
public class GetXmlAction extends ActionSupport{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Action(value = "getXMLAction")
    public String getXml() throws Exception{
        String string = "<name>ttt</name>";

        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("cache-control","no-cache");
        PrintWriter printWriter = response.getWriter();
        printWriter.write(string);
        printWriter.flush();
        printWriter.close();

        return null;
    }
}
