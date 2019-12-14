package com.searchbook.searchbook;

import com.searchbook.searchbook.model.Book;
import com.searchbook.searchbook.model.Library;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchController {

    private Library library;

    public SearchController(Library library) {
        this.library = library;
    }

    @RequestMapping("/search")
    public List<Book> searchRequest(SearchCriteria searchCriteria) {
            return library.search(searchCriteria);
    }
}
