package junitstuff;

import java.util.ArrayList;

public class lib {
    public ArrayList<Book> shelf = new ArrayList<Book>(); //i'm not sure if this is bad practice
    public ArrayList<Book> away = new ArrayList<Book>();

    public static void main(String[] args) {
        System.out.println("Hello, World!");

    }

    public void checkout(Book b) {
        if (shelf.contains(b) == false) {
            return;
        }

        b.checkout();
        shelf.remove(b);
        away.add(b);
    }

    public void returnBook(Book b) {
        away.remove(b);
        shelf.add(b);
    }

    public void addBook(Book b) {
        shelf.add(b);
    }

    public int getTotalBooks() {
        System.out.println("Total books: " + shelf.size());
        return shelf.size();
    }

    public String checkBookStatus(Book b) {
        if (shelf.contains(b)) {
            System.out.println("Book is on shelf it has been checked out this much " + b.getCheckoutAmount());
            return "book is on shelf it has been checked out this much " + b.getCheckoutAmount();
        } else if (away.contains(b)) {
            System.out.println("Book is checked out it has been checked out this much " + b.getCheckoutAmount());
            return "book is checked out it has been checked out this much " + b.getCheckoutAmount();
        } else {
            System.out.println("Book is not in library");
            return "book is not in library";
        }
    }


}
