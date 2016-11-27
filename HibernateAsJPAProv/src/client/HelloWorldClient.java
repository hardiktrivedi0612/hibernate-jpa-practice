package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Message;

public class HelloWorldClient {

    public static void main(String[] args) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction txn = em.getTransaction();
//        try {
//            txn.begin();
//
//            Message msg = new Message("Hello World with Hibernate as JPA Provider");
//            em.persist(msg);
//
//            txn.commit();
//        } catch (Exception e) {
//            if (txn != null) {
//                txn.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//        
//        
        //Working with objects
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");

        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();
        txn.begin();

        Message message = new Message("Hello"); //transient state        
        em.persist(message); //persistent state        

        txn.commit();
        em.close();

        message.setText("Hi"); //modifying the detached state of message

        EntityManager em2 = emf.createEntityManager();
        EntityTransaction txn2 = em2.getTransaction();
        txn2.begin();

        //the returned mergedMessage is a persistent object
        //any changes to mergedMessage will be dirty checked when the txn2 will be committed and updated in the database
        Message mergedMessage = em2.merge(message);

        txn2.commit();
        em2.close();

        //Detaching objects explicitly
        EntityManager em3 = emf.createEntityManager();
        EntityTransaction txn3 = em3.getTransaction();
        txn3.begin();

        Message msg = new Message("Howdy"); //transient state        
        em3.persist(msg); //persistent state    

        em3.detach(msg); //detaching the message object explicitly (changes after this wont affect the db)
        msg.setText("Howdy message after detaching. Should not change in database");
        txn3.commit();
        em3.close();

    }
}
