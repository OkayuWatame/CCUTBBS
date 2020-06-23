/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.action;

import com.dao.impl.BoardDaoImpl;
import com.entity.Board;
import javax.swing.JOptionPane;

/**
 *
 * @author 22603
 */
public class BoardAddAction {
    private String name;
    private String description;
    private int parentId;
    private int aid;
    private String message="input";
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    
    
    
    public Board board(){
        Board info = new Board();
        info.setName(this.getName());
        info.setDescription(this.getDescription());
        info.setParentId(this.getParentId());   
        return info;
    }
    public String execute() throws Exception{
        BoardDaoImpl dao=new BoardDaoImpl();
        String ri = dao.saveInfo(board());
         if(ri.equals("success")){
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
