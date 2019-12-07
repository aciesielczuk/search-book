package com.searchbook.searchbook;

import com.searchbook.searchbook.model.Book;
import com.searchbook.searchbook.model.Library;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SearchBookApplicationTests {

    @Autowired
    Library library;

    @Test
    void contextLoads() {
    }

    @Test
    public void librarySearchTestByAuthorWithSpringContext() {
        List<Book> expectedValue = new ArrayList<>();
        expectedValue.add(new Book("Horstmann", "Core Java", true));
        assertEquals(expectedValue.toString(), library.search(new SearchCriteria("Horstmann","author")).toString());
    }

    @Test
    public void librarySearchTestByTitleWithSpringContext() {
        List<Book> expectedValue = new ArrayList<>();
        expectedValue.add(new Book("Walls", "Spring in action", true));
        assertEquals(expectedValue.toString(), library.search(new SearchCriteria("Spring in action","title")).toString());
    }





}
