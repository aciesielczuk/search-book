package com.searchbook.searchbook;

import com.searchbook.searchbook.model.Book;
import com.searchbook.searchbook.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SearchController {

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
