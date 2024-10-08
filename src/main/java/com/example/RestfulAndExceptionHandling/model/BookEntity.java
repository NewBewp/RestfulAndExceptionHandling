package com.example.RestfulAndExceptionHandling.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_books")
public class BookEntity extends EntityDefine {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
}