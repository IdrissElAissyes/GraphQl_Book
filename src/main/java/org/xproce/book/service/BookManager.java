package org.xproce.book.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.xproce.book.dao.entities.Book;
import org.xproce.book.dao.repository.BookRepository;
import org.xproce.book.dto.BookDTO;
import org.xproce.book.mapper.BookMapper;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class BookManager implements BookService{
    private BookMapper bookMapper;
    private BookRepository bookRepository;
    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookMapper.fromBookDtoToBook(bookDTO);
       book=bookRepository.save(book);
      bookDTO=bookMapper.fromBookToBookDto(book);
      return bookDTO;
    }

    @Override
    public List<BookDTO> getBookByTitre(String title) {
        List<Book> books = bookRepository.findBytitre(title);
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (Book book : books) {
            bookDTOS.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDTOS;
}
}
