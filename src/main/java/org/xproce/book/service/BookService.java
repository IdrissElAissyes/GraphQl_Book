package org.xproce.book.service;

import org.xproce.book.dto.BookDTO;

import java.util.List;

public interface BookService {
    public BookDTO saveBook(BookDTO bookDTO);

    public List<BookDTO> getBookByTitre(String title);
}