package com.company.classes.books;

import com.company.classes.Counter;

import java.util.Arrays;

public class BookList {

    private Book[] books;
    private Counter counter;

    public BookList(Book[] books, Counter counter) {
        this.books = books;
        this.counter = counter;
    }

    public BookList(){
        books = new Book[1];
        counter = new Counter(0, Integer.MAX_VALUE, 0);
    }

    public void addBook(Book book){
        if (counter.getValue() == books.length){
            books = Arrays.copyOf(books, books.length+1);
        }
        book.setId(counter.getValue());
        books[counter.getValue()] = book;
        counter.increase();
    }

    public BookList getByAuthor(String author){
        BookList res = new BookList();
        for (Book book: books) {
            if (containsAuthor(author, book)){
                res.addBook(book);
            }
        }
        return res;
    }

    private boolean containsAuthor(String author, Book book){
        for (String s: book.getAuthor()) {
            if (s.equals(author)){
                return true;
            }
        }
        return false;
    }

    public BookList getByPublish(String publish){
        BookList res = new BookList();
        for (Book b: books) {
            if (publish.equals(b.getPublish())){
                res.addBook(b);
            }
        }
        return res;
    }

    public BookList getAfterYear(int year){
        BookList res = new BookList();
        for (Book b: books) {
            if (b.getYear() > year){
                res.addBook(b);
            }
        }
        return res;
    }

    public void print(){
        for (Book b: books) {
            System.out.println(b);
        }
    }

}
