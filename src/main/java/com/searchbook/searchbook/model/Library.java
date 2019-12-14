package com.searchbook.searchbook.model;

import com.searchbook.searchbook.SearchCriteria;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {

    public SearchCriteria searchCriteria;
    private List<Book> booksList;

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

    public List<Book> search(SearchCriteria searchCriteria) {
        Predicate<Book> searchValue = null;
        if (searchCriteria.getSearchBy().equals("author"))
            searchValue = b -> b.getAuthor().equals(searchCriteria.getQuery());
        else if (searchCriteria.getSearchBy().equals("title"))
            searchValue = b -> b.getTitle().equals(searchCriteria.getQuery());
        return booksList.stream().filter(Objects.requireNonNull(searchValue)).collect(Collectors.toList());
    }

}
