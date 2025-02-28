package junitstuff;

public class Book {
    private String bookTitle;
    private String author;
    private String isbn;
    private double price;
    private int year;
    private int checkout_amount;
    //tedious as heck

    public Book(){

    }
    public Book(String bookTitle, String author, String isbn, double price, int year, int checkout_amount) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.year = year;
        this.checkout_amount = checkout_amount;
    }

    public String getTitle() {return bookTitle;}
    public String getAuthor() {return author;}
    public String getIsbn() {return isbn;}
    public double getPrice() {return price;}
    public int getYear() {return year;}
    public int getCheckoutAmount() {return checkout_amount;}

    public void checkout() {
        checkout_amount++;
    }
}
