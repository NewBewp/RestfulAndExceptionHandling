package com.example.RestfulAndExceptionHandling.dto.bookDTO;

import lombok.Data;


import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private int id;
    private String title;
    private String author;
}
