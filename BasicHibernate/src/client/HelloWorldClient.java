/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entity.Address;
import entity.Guide;
import entity.Message;
import entity.Person;
import entity.Student;
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
////        
//        
//        
        //Start: Manipulating Objects
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction txn = session.getTransaction();
//        try {
//            txn.begin();
//            //Finding objects
//            Message message = (Message) session.get(Message.class, 2L);
////            System.out.println(message);
//
//            //Updating Objects
////            message.setText("Automatic Dirty Checking");
//            
//            //Deleting objects
//            session.delete(message);
//
//            txn.commit();
//        } catch (Exception e) {
//            if (txn != null) {
//                txn.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }

//        
//        
//        
        
        //Start Component Mapping and automatic create/update tables by hibernate
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction txn = session.getTransaction();
//        try {
//            txn.begin();
//
//            Address address = new Address("200 E Main St", "Seattle", "85123");
//            Person person = new Person("Ruby", address);
//
//            session.save(person);
//            
//            Person samePerson = (Person) session.get(Person.class, 1L);
//            System.out.println(samePerson);
//
//            txn.commit();
//        } catch (Exception e) {
//            if (txn != null) {
//                txn.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        
//        
//        
//        
        //Start Mapping association - Many to one
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction txn = session.getTransaction();
//        try {
//            txn.begin();
//
//            Guide guide = new Guide("2000MO10789", "Mike Lawson", 1000);
//            Student student = new Student("2014JT50123", "John Smith", guide);
//
//            session.save(guide);
//            session.save(student);
//
//            System.out.println((Student) session.get(Student.class, 1L));
//
//            txn.commit();
//        } catch (Exception e) {
//            if (txn != null) {
//                txn.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        
//        
//        
//        
        //Start - Cascade Types PERIST and REMOVE
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction txn = session.getTransaction();
//        try {
//            txn.begin();
//
//            // persisting Student object
//            Guide guide = new Guide("2000IM10901", "Ian Lamb", 2000);
//            Student student = new Student("2014AL50456", "Amy Gill", guide);
//
//            session.persist(student);
//
//            // deleting Student object
//            Student deletedDtudent = (Student) session.get(Student.class, 3L);
//            session.delete(deletedDtudent);
//
//            txn.commit();
//        } catch (Exception e) {
//            if (txn != null) {
//                txn.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        
//        
//        
//        
        //Start - One-to-many bidirectional relationship
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction txn = session.getTransaction();
//        try {
//            txn.begin();
//
//            //Normal insertion after doing a one-to-many bidirectional association 
////            Guide guide1 = new Guide("2000MO10789", "Mike Lawson", 1000);
////            Guide guide2 = new Guide("2000IM10901", "Ian Lamb", 2000);
////
////            Student student1 = new Student("2014JT50123", "John Smith", guide1);
////            Student student2 = new Student("2014AL50456", "Amy Gill", guide1);
////
////            guide1.getStudents().add(student1);
////            guide1.getStudents().add(student2);
////
////            session.persist(guide1);
////            session.persist(guide2);
//            //Updating inverse end - has no effect
////            Guide guide = (Guide) session.get(Guide.class, 2L);
////            Student student = (Student) session.get(Student.class, 2L);
////            guide.getStudents().add(student);
//            //Updating owner - has effect
////            Guide guide = (Guide) session.get(Guide.class, 2L);
////            Student student = (Student) session.get(Student.class, 2L);
////            student.setGuide(guide);
//            //Updating inverse end (after adding addStudent(Student) in Guide entity)
//            Guide guide = (Guide) session.get(Guide.class, 2L);
//            Student student = (Student) session.get(Student.class, 1L);
//            guide.addStudent(student);
//            txn.commit();
//        } catch (Exception e) {
//            if (txn != null) {
//                txn.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
        
        
    }
}
