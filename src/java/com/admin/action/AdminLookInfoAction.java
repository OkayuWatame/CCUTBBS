/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.action;

import com.dao.impl.AdminDaoImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author 22603
 */
public class AdminLookInfoAction {
        
    private HttpServletRequest request;
    private String message="input";
    
    public String execute() throws Exception{
        request=ServletActionContext.getRequest();
        AdminDaoImpl dao=new AdminDaoImpl();
        List list=dao.findAllInfo();
        request.getSession().setAttribute("count", list.size());
        request.getSession().setAttribute("allInfo", list);
        message="success";
        return message;
    }    
}
