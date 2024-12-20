package org.xproce.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.book.dto.BookDTO;
import org.xproce.book.service.BookService;

import java.util.List;

@SpringBootApplication
public class BookApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);

    }
    @Bean
    CommandLineRunner start(BookService bookService) {
        return args -> {
            // Création et sauvegarde d'une liste de livres
            List<BookDTO> books = List.of(
                    BookDTO.builder()
                            .titre("Book 1")
                            .publisher("yyy")
                            .datePublication("ABC123")
                            .price(12345.0)
                            .build(),
                    BookDTO.builder()
                            .titre("Book 2")
                            .resume("Green")
                            .datePublication("XYZ456")
                            .price(65489.0)
                            .build(),
                    BookDTO.builder()
                            .titre("Book 3")
                            .resume("Yellow")
                            .datePublication("LMN789")
                            .price(89789.0)
                            .build(),
                    BookDTO.builder()
                            .titre("Book 4")
                            .resume("Black")
                            .datePublication("OPQ101")
                            .price(67489.0)
                            .build()
            );

            // Sauvegarde des livres via le service
            books.forEach(bookService::saveBook);
        };
    }

}
