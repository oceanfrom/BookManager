package org.example.models;

import jakarta.validation.constraints.*;

public class Book {
    private int id;
    @Pattern(regexp = "[A-Z].*", message = "Not a correct format")
    private String name;
    @Pattern(regexp = "[A-Z][a-z]+ [A-Z][a-z]+", message = "Not a correct format")
    private String author;
    @Min(value = 1500, message = "Book from 1500")
    private int year;

    public Book() {;}

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
