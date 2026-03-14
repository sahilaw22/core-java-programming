/* Create a class Book with attributes title and price. Implement two constructors: one default constructor and one parameterized constructor. Display the book details. */

import java.util.*;

class Book {
    String title;
    int price;

    Book() {
        title = null;
        price = 0;
    }
    Book(String t, int p) {
        title = t;
        price = p;
    }
}
public class SET2P4 {
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Machine",2000);
        System.out.println("Default title: " + b1.title + "\nDefault price: "+ b1.price);
        System.out.println("Book Title: " + b2.title + "\nRetail Price: " + b2.price);

    }
}
