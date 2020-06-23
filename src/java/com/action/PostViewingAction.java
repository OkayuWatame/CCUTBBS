/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.impl.PostDaoImpl;
import com.dao.impl.ReplyDaoImpl;
import com.entity.Post;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author 22603
 */
public class PostViewingAction {
    
    private int id;
    private HttpServletRequest request;
    private String message="input";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Post post(){
        Post post = new Post();
        post.setId(this.getId());
        return post;
    }
    
    public String execute() throws Exception{
        request=ServletActionContext.getRequest();
        PostDaoImpl dao=new PostDaoImpl();
        List list=dao.queryInfo("id", this.getId());
        request.getSession().setAttribute("oneInfo", list);
        ReplyDaoImpl reply = new ReplyDaoImpl();
        List L = reply.findAllInfo();
        request.getSession().setAttribute("allreply", L);
        
        request=ServletActionContext.getRequest();
        request.getSession().setAttribute("postid",this.getId());
        message="success";
        return message;
    }     
}
