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

    public Book(){
        title = "Math";
        author = new String[]{"Pifagor"};
        publish = "SamosBook";
        year = -550;
        pages = 100;
        price = 1000;
        binding = "no";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

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
