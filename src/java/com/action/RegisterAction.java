/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.impl.StudentDaoImpl;
import com.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author 22603
 */
public class RegisterAction extends ActionSupport{

    private int stuNum;
    private String realName;
    private String password;
    private String nickName;
    private String qq;
    private String email;
    private String major;
    private String className;
    
     private String mess="error";

    
    
    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    
   
    public Student student(){
        Student info = new Student();
        info.setStuNum(this.getStuNum());
        info.setRealName(this.getRealName());
        info.setNickName(this.getNickName());
        info.setPassword(this.getPassword());
        info.setQq(this.getQq());
        info.setEmail(this.getEmail());
        info.setMajor(this.getMajor());
        info.setClassName(this.getClassName());
        
        return info;
    }

    
    
     public String execute() throws Exception{
        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
        String ri=studentDaoImpl.saveInfo(student());
        if(ri.equals("success")){
            mess="success";
        }
        return mess;
        
    }   
}
