/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.impl.StudentDaoImpl;
import com.entity.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author 22603
 */
public class StudentUpdateAction {

    private int id;
    private int stuNum;
    private String realName;
    private String nickName;
    private String password;
    private String qq;
    private String email;
    private String major;
    private String className;
    private String photoPath;
    private String message="input";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
    
    
    
    public String execute() throws Exception{
        StudentDaoImpl dao=new StudentDaoImpl();
        boolean update=dao.updateInfo(info());
        if(update){
            message="success";
        }
        return message;
    }
    public Student info(){
        Student info=new Student();
        info.setId(this.getId());
        info.setStuNum(this.getStuNum());
        info.setRealName(this.getRealName());
        info.setNickName(this.getNickName());
        info.setPassword(this.getPassword());
        info.setQq(this.getQq());
        info.setEmail(this.getEmail());
        info.setMajor(this.getMajor());
        info.setClassName(this.getClassName());       
        info.setPhotoPath(this.getPhotoPath());      
        return info;
    }
    public void message(String mess){
        int type=JOptionPane.YES_NO_OPTION;
        String title="提示信息";
        JOptionPane.showMessageDialog(null, mess, title, type);
    }
}
