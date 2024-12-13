package testCom;

import java.util.*;
public class Book {
    int id;
    String bookName, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.bookName = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

    class Test{
        public static void main(String[] args) {
            //Creating list of book
            ArrayList<Book> list = new ArrayList<Book>();

            //creating book
            Book b1 = new Book(1,"Test","Milan","Test",10);

            //Adding book to list
            list.add(b1);

            //Traversing the list
            for(Book print:list){
                System.out.println(b1.id + b1.author +b1.bookName+b1.publisher+b1.quantity);
            }

        }
    }

