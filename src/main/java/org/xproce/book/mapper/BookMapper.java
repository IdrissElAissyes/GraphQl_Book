package org.xproce.book.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.book.dao.entities.Book;
import org.xproce.book.dto.BookDTO;

@Component
public class BookMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDtoToBook(BookDTO BookDto){
        return mapper.map(BookDto, Book.class);
    }

    public BookDTO fromBookToBookDto(Book book){
        return mapper.map(book, BookDTO.class);
    }

}
