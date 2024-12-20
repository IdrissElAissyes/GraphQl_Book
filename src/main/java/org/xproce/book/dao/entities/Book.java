package org.xproce.book.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idBook;
        private String titre;
        private String publisher;
        private LocalDate datePublication;
        private Double price;
        private String  resume;

}

