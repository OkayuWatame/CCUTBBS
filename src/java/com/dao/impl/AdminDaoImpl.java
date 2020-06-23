/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import addHibernateFile.HibernateSessionFactory;
import com.entity.Admin;
import com.entity.Student;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author 22603
 */
public class AdminDaoImpl {
    private Session session;
    private Transaction transaction;
    private Query query;
    private HibernateSessionFactory getSession;
    
    public String saveInfo(Admin info){
        String mess="error";
        getSession = new HibernateSessionFactory();
        session=HibernateSessionFactory.getSession();
        try{
            transaction= session.beginTransaction();
            session.save(info);
            transaction.commit();
            mess="success";
            return mess;
        }catch(Exception e){
            message("RegisterInfo.Error："+e);
            e.printStackTrace();
            return null;
        }
    }
    public List queryInfo(String type,Object value){
        getSession =new HibernateSessionFactory();
        session = getSession.getSession();
        try{
            String hqlsql = "from Admin as u where u.account=?";
            query=session.createQuery(hqlsql);
            query.setParameter(0,value);
            List list = query.list();
            transaction = session.beginTransaction();
            transaction.commit();
            return list;
        }catch(Exception e){
            message("类中有异常"+e);
            e.printStackTrace();
            return null;
        }
    }
    
         public List findAllInfo(){
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            String queryString="from Admin";
            query=session.createQuery(queryString);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("findInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }
    public boolean deleteInfo(int id){
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            Student info=new Student();
            info=(Student)session.get(Student.class, id);
            session.delete(info);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("deleteInfo.error:"+e);
            e.printStackTrace();
            return false;
        }
    }
    public boolean updateInfo(Student info){
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            session.update(info);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("updateInfo.error:"+e);
            e.printStackTrace();
            return false;
        }
    }
    
    public void message(String mess){
        int type=JOptionPane.YES_NO_OPTION;
        String title="提示信息";
        JOptionPane.showMessageDialog(null,mess,title,type);
    }
}
