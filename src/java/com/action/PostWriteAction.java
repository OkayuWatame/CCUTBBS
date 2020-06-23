/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.impl.PostDaoImpl;
import com.entity.Post;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author 22603
 */
public class PostWriteAction {
    private String name;
    private String content;
    private Timestamp publishTime;
    private int sid;
    private int bid;
    
    private String message="input";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }
    
    public Post info(){
        Post info=new Post();
        info.setName(this.getName());
        info.setPublishTime(this.getPublishTime());
        info.setContent(this.getContent());
        info.setSid(this.getSid());
        info.setBid(this.getBid());
        return info;
    }
    
    public String execute() throws Exception{
        PostDaoImpl dao=new PostDaoImpl();
        String update=dao.saveInfo(info());
        if(update.equals("success")){
            message="success";
        }
        return message;
    }

    public void message(String mess){
        int type=JOptionPane.YES_NO_OPTION;
        String title="提示信息";
        JOptionPane.showMessageDialog(null, mess, title, type);
    }
}
