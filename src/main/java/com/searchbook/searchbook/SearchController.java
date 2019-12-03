package com.searchbook.searchbook;

import com.searchbook.searchbook.model.Book;
import com.searchbook.searchbook.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class SearchController {

    //@Value("${}")
    private boolean enabled;
    private Library library;

    @Autowired
    public SearchController(Library library) {
        this.library = library;
    }

    @RequestMapping("/search")
    public List<Book> search(SearchCriteria searchCriteria) {
        return library.search(searchCriteria);
    }
}

//    @GetMapping
//    public List<Book> getSearchRequestParamByAuthor(@RequestParam String author) {
//        return library.getBooksList().stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
//    }
//
//    @GetMapping()
//    public List<Book> getSearchRequestParamByTitle(@RequestParam String title) {
//        return library.getBooksList().stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
//    }
//
//    @GetMapping()
//    public List<Book> getBooks() {
//        return library.getBooksList();
//    }
//
