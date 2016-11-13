
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriell
 */
public class Library {

    private ArrayList<Book> Books;
    
    public Library() {
        this.Books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        Books.add(newBook);
    }
    
    public void printBooks() {
        for (Book book : Books) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String searchedTitle) {
     ArrayList<Book> found = new ArrayList<Book>();
     // iterate the list of books and add all the matching books to the list found
     for (Book b : Books) {
         if (StringUtils.included(b.title(), searchedTitle)) {
             found.add(b);
         }
     }
     return found;
   }
    
    public ArrayList<Book> searchByPublisher(String searchedPublisher) {
     ArrayList<Book> found = new ArrayList<Book>();
     // iterate the list of books and add all the matching books to the list found
     for (Book b : Books)
         if (StringUtils.included(b.publisher(), searchedPublisher)) {
             found.add(b);
         }
     return found;
   }
    
    public ArrayList<Book> searchByYear(int year) {
     ArrayList<Book> found = new ArrayList<Book>();
     // iterate the list of books and add all the matching books to the list found
     for (Book b : Books) {
         if (b.year() == year) {
             found.add(b);
         }
     }
     return found;
}
}
