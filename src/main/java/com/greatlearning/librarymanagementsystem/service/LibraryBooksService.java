package com.greatlearning.librarymanagementsystem.service;

import com.greatlearning.librarymanagementsystem.entity.LibraryBooks;

import java.util.List;

public interface LibraryBooksService {

    List<LibraryBooks> getAllBooks();

    LibraryBooks getById(Long bookId);

    List<LibraryBooks> getByName(String bookName);

    LibraryBooks getByLastAdded();

    List<LibraryBooks> getByAuthor(String authorName);

    List<LibraryBooks> getBooksByAscendingOrder();

    LibraryBooks addBooks(LibraryBooks book);

    void deleteById(Long bookId);

    void deleteAllBooks();


}
