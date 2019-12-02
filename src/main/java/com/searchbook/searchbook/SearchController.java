package com.searchbook.searchbook;

import com.searchbook.searchbook.model.Book;
import com.searchbook.searchbook.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RestController
@RequestMapping("/books")
public class SearchController {

    private Library library;

    @Autowired
    public SearchController(Library library) {
        this.library = library;
    }

    @GetMapping
    public List<Book> getSearchRequestParamByAuthor(@RequestParam String author) {
        return library.getBooksList().stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
    }

    @GetMapping()
    public List<Book> getSearchRequestParamByTitle(@RequestParam String title) {
        return library.getBooksList().stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    @GetMapping()
    public List<Book> getBooks() {
        return library.getBooksList();
    }


}
