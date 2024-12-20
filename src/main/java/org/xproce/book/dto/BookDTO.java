package org.xproce.book.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BookDTO {
    private String titre;
    private String publisher;
    private String datePublication;
    private Double price;
    private String resume;
}
