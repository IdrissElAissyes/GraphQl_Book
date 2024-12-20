package org.xproce.book.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.book.dao.entities.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>  {
    public List<Book> findBytitre(String title);

}
