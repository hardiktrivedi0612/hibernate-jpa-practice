/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entity.Message;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Hardik
 */
public class HelloWorldClient {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Message message = new Message("Hello world with Hibernate & JPA");
        
        session.save(message);
        
        session.getTransaction().commit();
        session.close();
    }
}
