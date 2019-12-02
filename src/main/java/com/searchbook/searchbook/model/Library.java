package com.searchbook.searchbook.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class Library {

    private List<Book> booksList;

    @Autowired
    public Library() {
        this.booksList = createList();
    }

    private List<Book> createList() {
        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add(new Book("Martin", "Clean Code", true));
        booksList.add(new Book("Walls", "Spring in action", true));
        booksList.add(new Book("Horstmann", "Core Java", true));
        booksList.add(new Book("Eckel", "Thinking in Java", true));
        booksList.add(new Book("Martin", "Clean Architecture", false));
        return booksList;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }


}
