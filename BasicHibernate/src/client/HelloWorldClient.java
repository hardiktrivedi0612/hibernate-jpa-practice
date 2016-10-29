/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entity.Message;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Hardik
 */
public class HelloWorldClient {

    public static void main(String[] args) {
//        
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        
//        Message message = new Message("Hello world with Hibernate & JPA");
//        
//        session.save(message);
//        
//        session.getTransaction().commit();
//        session.close();
//        
        //Start: Manipulating Objects
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction txn = session.getTransaction();
        try {
            txn.begin();
            //Finding objects
            Message message = (Message) session.get(Message.class, 2L);
//            System.out.println(message);

            //Updating Objects
//            message.setText("Automatic Dirty Checking");
            
            //Deleting objects
            session.delete(message);

            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
