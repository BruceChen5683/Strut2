package com.cjl.www.json;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by chenjianliang on 2018/5/20.
 */
public class GetJsonAction extends ActionSupport{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Action(value = "getJsonAction")
    public String myexecute() throws Exception {
        Person person = new Person();
        person.setAge(100);
        person.setHomeAddress("sh");
        person.setId(1);
        person.setName("none");

        Gson gson = new Gson();
        String result =gson.toJson(person);

        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("application/json;charset=utf-8");
        response.setHeader("cache-control","no-cache");

        PrintWriter printWriter = response.getWriter();
        printWriter.print(result);
        printWriter.flush();
        printWriter.close();
//        System.out.println("GetJsonAction.execute "+result);
        return null;
    }
}
