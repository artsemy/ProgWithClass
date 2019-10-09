package com.company.classes.books;

import java.util.Arrays;

public class Book {

    private int id;
    private String title;
    private String[] author;
    private String publish;
    private int year;
    private int pages;
    private double price;
    private String binding;

    //constructor
    public Book(int id, String title, String[] author, String publish, int year, int pages, double price, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    //constructor
    public Book(){
        title = "Math";
        author = new String[]{"Pifagor"};
        publish = "SamosBook";
        year = -550;
        pages = 100;
        price = 1000;
        binding = "no";
    }

    //get method
    public int getId() {
        return id;
    }

    //set method
    public void setId(int id) {
        this.id = id;
    }

    //get method
    public String[] getAuthor() {
        return author;
    }

    //set method
    public void setAuthor(String[] author) {
        this.author = author;
    }

    //get method
    public String getPublish() {
        return publish;
    }

    //set method
    public void setPublish(String publish) {
        this.publish = publish;
    }

    //get method
    public int getYear() {
        return year;
    }

    //set method
    public void setYear(int year) {
        this.year = year;
    }

    //to string
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publish='" + publish + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }

}
