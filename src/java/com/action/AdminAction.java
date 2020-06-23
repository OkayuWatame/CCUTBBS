/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.impl.AdminDaoImpl;
import com.entity.Admin;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author 22603
 */
public class AdminAction extends ActionSupport{
    private String account;
    private String password;
    private HttpServletRequest request;
    private String message="error";
    private List list;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    public void validate(){
            if(this.getAccount()==null||this.getAccount().length()==0){
                addFieldError("userName","用户名不能为空！");
            }else{
                AdminDaoImpl info=new AdminDaoImpl();
                list=info.queryInfo("account", this.getAccount());
                if(list.size()==0){
                    addFieldError("account","该用户尚未注册！");
                }else{
                    Admin ui=new Admin();
                    int count=0;
                    for(int i=0;i<list.size();i++){
                        count++;
                        ui=(Admin)list.get(i);
                        if(this.getAccount().equals(ui.getAccount())){
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
