package com.cjl.www;

import com.cjl.www.bean.Person;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

/**
 * Created by chenjianliang on 2018/4/17.
 */
public class RegisterAction2 extends ActionSupport implements ModelDriven<Person>{
    private Person person = new Person();

    @Override
    public Person getModel() {
        return person;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("RegisterAction2.execute"+"name:"+person.getName()+"  ps:"+person.getPassword());
        return SUCCESS;
    }
}
