package com.searchbook.searchbook.model;


public class Book {
    private String author;
    private String title;
    private boolean availability;

    public Book() {
    }

    public Book(String author, String title, boolean availability) {
        this.author = author;
        this.title = title;
        this.availability = availability;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "{Author=" + getAuthor() +
                ", Title=" + getTitle() +
                ", Availability=" + isAvailability() + "}";
    }
}
