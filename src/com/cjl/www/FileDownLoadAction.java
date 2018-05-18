package com.cjl.www;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by chenjianliang on 2018/5/16.
 */
public class FileDownLoadAction extends ActionSupport {
    public InputStream getMydownloadFile(){
        try {
            FileInputStream inputStream = new FileInputStream(new File("/Users/chenjianliang/IdeaProjects/strut2/upload/FAQ"));
            return inputStream;
        }catch (Exception e){
            return null;
        }
        /*
        *
        * Can not find a java.io.InputStream with the name [inputStream] in the invocation stack. Check the <param name="inputName"> tag specified for this action.


        1.文件路径不对，根本就没有取到文件。这种情况下，可以将获得InputStream的那条语句放在system.out.println()中输出一下，若为null，那就是路径不对了，或者说得准确些就根本没有找到文件。
2.在action中没有写配置文件中"<param name="inputName">"后面属性的那个get方法.
当以上两种情况都正确的情况下，问题就在这里了：
当采用 return ServletActionContext.getServletContext().getResourceAsStream("...") 这种方法获得输入流的时候，要保证文件位置在 ServletContext 当中，就是说要在当前的应用上下文中，
如果想要获得外部文件 譬如 D盘中的某个文件，那么就要自己创建输入流才可以
*/
//        return ServletActionContext.getServletContext().getResourceAsStream("/upload/FAQ");
    }


    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
