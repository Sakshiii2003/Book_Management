package com.api.book.bootrestbook.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Service
public class BookService {
  
private BookRepository bookRepository;
@Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //db vale service se interact kr rahi hogi
    //private static List<Book> l=new ArrayList<>();
   // static{
     //   l.add(new Book(12,"Heart Of blue Sea","Jagruti"));
       //  l.add(new Book(13,"The Life Of Wicked","Parinova"));
         //  l.add(new Book(7,"The Rise Of A Flower","Anki Bette"));
    //}
    //to get all book
    public List<Book> getAllBooks()
    {
        List<Book>l=(List<Book>)this.bookRepository.findAll();
        return l;
    }
    public BookService() {
    }
    //to get single
    public Book getBookById(int id)
    {
        Book book=null;
        try
        {
        //book=l.stream().filter(e->e.getId()==id).findFirst().get();
        book=this.bookRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return book;
    }
    public Book addbook(Book b)
    {
       Book res= bookRepository.save(b);
        return res;
    }
    public void deleteBook(int id) {

        //l=l.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
        bookRepository.deleteById(id);
}
    public void updateBook(Book book, int id) {
        //l=l.stream().map(b->
        //{
          //  if(b.getId()==id)
            //{
              //  b.setTitle(book.getTitle());
                //b.setAuthor(book.getAuthor());
            //}
            //return b;
        //}).collect(Collectors.toList());
        book.setId(id);
       bookRepository.save(book); 
    }
}
