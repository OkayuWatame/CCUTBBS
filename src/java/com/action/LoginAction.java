/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.impl.StudentDaoImpl;
import com.entity.Student;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author 22603
 */
public class LoginAction extends ActionSupport{
    private String nickName;
    private String password;
    private HttpServletRequest request;
    private String message="error";
    private List list;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    public void validate(){
            if(this.getNickName()==null||this.getNickName().length()==0){
                addFieldError("userName","用户名不能为空！");
            }else{
                StudentDaoImpl info=new StudentDaoImpl();
                list=info.queryInfo("userName", this.getNickName());
                if(list.size()==0){
                    addFieldError("userName","该用户尚未注册！");
                }else{
                    Student ui=new Student();
                    int count=0;
                    for(int i=0;i<list.size();i++){
                        count++;
                        ui=(Student)list.get(i);
                        if(this.getNickName().equals(ui.getNickName())){
                            if(ui.getPassword().equals(this.getPassword())){
                                message="success";
                                
                                request=ServletActionContext.getRequest();
                                request.getSession().setAttribute("loginflag",ui.getId() );
                                
                            }else{
                                addFieldError("password","登录密码不正确！");
                            }
                        }
                    }
                }
            }
    }
    public String execute() throws Exception{
        return message;
    }   
}
