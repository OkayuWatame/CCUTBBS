/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.impl.PostDaoImpl;
import com.dao.impl.ReplyDaoImpl;
import com.entity.Post;
import com.entity.Reply;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author 22603
 */
public class ReplyWriteAction {
    private String content;
    private Timestamp publishTime;
    private int pid;
    private int sid;
    
    private String message="input";


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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    
    
    public Reply info(){
        Reply info=new Reply();
        info.setPublishTime(this.getPublishTime());
        info.setContent(this.getContent());
        info.setSid(this.getSid());
        info.setPid(this.getPid());
        return info;
    }
    
    public String execute() throws Exception{
        ReplyDaoImpl dao=new ReplyDaoImpl();
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
