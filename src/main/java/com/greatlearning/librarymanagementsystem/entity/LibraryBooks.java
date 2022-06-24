package com.greatlearning.librarymanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class LibraryBooks {

    @Id
    private Long id;
    private String bookName;
    private String author;
    private double cost;
}
