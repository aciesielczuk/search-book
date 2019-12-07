package com.searchbook.searchbook.model;

import com.searchbook.searchbook.SearchCriteria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    @Test
    public void searchTestByAuthor() {
        Library library = new Library();
        List<Book> expectedList = new ArrayList<>();
        expectedList.add(new Book("Martin", "Clean Code", true));
        expectedList.add(new Book("Martin", "Clean Architecture", false));

        Assertions.assertEquals(expectedList.toString(), library.search(new SearchCriteria("Martin", "author")).toString());
    }

    @Test
    public void searchTestByTitle() {
        Library library = new Library();
        List<Book> expectedList = new ArrayList<>();
        expectedList.add(new Book("Horstmann", "Core Java", true));

        Assertions.assertEquals(expectedList.toString(), library.search(new SearchCriteria("Core Java", "title")).toString());
    }

}
