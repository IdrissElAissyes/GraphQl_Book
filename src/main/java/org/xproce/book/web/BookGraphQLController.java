package org.xproce.book.web;

import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.xproce.book.dto.BookDTO;
import org.xproce.book.service.BookService;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphQLController {
    private BookService bookService;
    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book){
        return bookService.saveBook(book);
    }
    @QueryMapping
    public List<BookDTO> getAvionByModel(@Argument String title){
        return bookService.getBookByTitre(title);
    }
}
