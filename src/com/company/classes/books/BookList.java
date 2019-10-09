package com.company.classes.books;

import com.company.classes.Counter;

import java.util.Arrays;

public class BookList {

    private Book[] books;
    private Counter counter;

    //constructor
    public BookList(){
        books = new Book[1];
        counter = new Counter(0, Integer.MAX_VALUE, 0);
    }

    //add book to array
    public void addBook(Book book){
        if (counter.getValue() == books.length){
            books = Arrays.copyOf(books, books.length+1);
        }
        book.setId(counter.getValue());
        books[counter.getValue()] = book;
        counter.increase();
    }

    //get array by author
    public BookList getByAuthor(String author){
        BookList res = new BookList();
        for (Book book: books) {
            if (containsAuthor(author, book)){
                res.addBook(book);
            }
        }
        return res;
    }

    //check for author
    private boolean containsAuthor(String author, Book book){
        for (String s: book.getAuthor()) {
            if (s.equals(author)){
                return true;
            }
        }
        return false;
    }

    //get array by publisher
    public BookList getByPublish(String publish){
        BookList res = new BookList();
        for (Book b: books) {
            if (publish.equals(b.getPublish())){
                res.addBook(b);
            }
        }
        return res;
    }

    //get array released after year
    public BookList getAfterYear(int year){
        BookList res = new BookList();
        for (Book b: books) {
            if (b.getYear() > year){
                res.addBook(b);
            }
        }
        return res;
    }

    //print array
    public void print(){
        for (Book b: books) {
            System.out.println(b);
        }
    }

}
