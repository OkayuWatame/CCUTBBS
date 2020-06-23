/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.action;

import com.dao.impl.BoardDaoImpl;
import com.entity.Board;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author 22603
 */
public class AdminBoardAction {
    private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    public String execute() throws Exception{
        BoardDaoImpl dao=new BoardDaoImpl();
        boolean del=dao.deleteInfo(this.getId());
        if(del){
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
