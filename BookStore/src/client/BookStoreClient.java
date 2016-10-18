/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import domain.Book;
import domain.Chapter;
import domain.Publisher;
import java.util.ArrayList;
import java.util.List;
import service.BookStoreService;

/**
 *
 * @author Hardik
 */
public class BookStoreClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BookStoreService bookStoreService = new BookStoreService();

//        //persisting object graph
//        Publisher publisher = new Publisher("MANN", "Manning Publications Co.");
//
//        Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);
//
//        List<Chapter> chapters = new ArrayList<Chapter>();
//        Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
//        chapters.add(chapter1);
//        Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
//        chapters.add(chapter2);
//
//        book.setChapters(chapters);
//
//        bookStoreService.persistObjectGraph(book);

//        //retrieving object graph
        Book book = bookStoreService.retrieveObjectGraph("9781617290459");
        System.out.println(book);
    }

}
