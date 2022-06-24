package com.greatlearning.librarymanagementsystem.repository;

import com.greatlearning.librarymanagementsystem.entity.LibraryBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface libraryBooksRepo extends JpaRepository<LibraryBooks,Long> {
    List<LibraryBooks> findByBookName(String bookName);
    List<LibraryBooks> findByAuthor(String author);

}
