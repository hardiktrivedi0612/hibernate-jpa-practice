package client;

import entity.Guide;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Message;
import entity.Student;
import java.util.Set;

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
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
//
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction txn = em.getTransaction();
//        txn.begin();
//
//        Message message = new Message("Hello"); //transient state        
//        em.persist(message); //persistent state        
//
//        txn.commit();
//        em.close();
//
//        message.setText("Hi"); //modifying the detached state of message
//
//        EntityManager em2 = emf.createEntityManager();
//        EntityTransaction txn2 = em2.getTransaction();
//        txn2.begin();
//
//        //the returned mergedMessage is a persistent object
//        //any changes to mergedMessage will be dirty checked when the txn2 will be committed and updated in the database
//        Message mergedMessage = em2.merge(message);
//
//        txn2.commit();
//        em2.close();
//
//        //Detaching objects explicitly
//        EntityManager em3 = emf.createEntityManager();
//        EntityTransaction txn3 = em3.getTransaction();
//        txn3.begin();
//
//        Message msg = new Message("Howdy"); //transient state        
//        em3.persist(msg); //persistent state    
//
//        em3.detach(msg); //detaching the message object explicitly (changes after this wont affect the db)
//        msg.setText("Howdy message after detaching. Should not change in database");
//        txn3.commit();
//        em3.close();
//        
//        
//        
//        
//        
//        //Caching objects - First level caching - entity manager level caching - happens by defaul
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
//
////        //First-level Caching
////        EntityManager em = emf.createEntityManager();
////
////        em.getTransaction().begin();
////
////        Message message1 = em.find(Message.class, 7L);
////        Message message2 = em.find(Message.class, 7L);
////
////        em.getTransaction().commit();
////        em.close();
//
//        // Is First-level Caching still going work?
//        EntityManager em1 = emf.createEntityManager();
//        em1.getTransaction().begin();
//
//        Message message1 = em1.find(Message.class, 7L);
//
//        em1.getTransaction().commit();
//        em1.close();
//
//        EntityManager em2 = emf.createEntityManager();
//        em2.getTransaction().begin();
//
//        Message message2 = em2.find(Message.class, 7L);
//
//        em2.getTransaction().commit();
//        em2.close();
//        
//        
//        
//        
//        
        //LAZY fetching
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction txn = em.getTransaction();
//        try {
//            txn.begin();
//
//            //Lazy Collection Fetching with default settings(fetch=FetchType.LAZY for collection associations)
////            Guide guide = em.find(Guide.class, 2L);
////            Set<Student> students = guide.getStudents();
////            int numberOfStudents = students.size();
//
//            //Eager Fetching with default settings (fetch=FetchType.EAGER for single point associations)
//            Student student = em.find(Student.class, 2L);
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
//        
//        
//        
        //Equals and Hashcode
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");

        //Guide with id=2L and Student with id=2L, both are  being managed by different EntityManager
//        EntityManager em1 = emf.createEntityManager();
//        em1.getTransaction().begin();
//
//        Student student = em1.find(Student.class, 2L);
//
//        em1.getTransaction().commit();
//        em1.close();
//
//        EntityManager em2 = emf.createEntityManager();
//        em2.getTransaction().begin();
//
//        Guide guide = em2.find(Guide.class, 2L);
//        Set<Student> students = guide.getStudents();
//
//        System.out.println(students.contains(student)); // returns false as we are having no equals and hashcode and have different entity managers
//
//        em2.getTransaction().commit();
//        em2.close();
        //Guide with id=2L and Student with id=2L, both are  being managed by the same EntityManager
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        Student student = em.find(Student.class, 2L);
//
//        Guide guide = em.find(Guide.class, 2L);
//        Set<Student> students = guide.getStudents();
//
//        System.out.println(students.contains(student)); // returns true as we have caching on entity manager level
//
//        em.getTransaction().commit();
//        em.close();

    }
}
