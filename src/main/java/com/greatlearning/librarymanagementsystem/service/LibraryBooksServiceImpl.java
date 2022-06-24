package com.greatlearning.librarymanagementsystem.serviceImpl;

import com.greatlearning.librarymanagementsystem.entity.LibraryBooks;
import com.greatlearning.librarymanagementsystem.repository.libraryBooksRepo;
import com.greatlearning.librarymanagementsystem.service.LibraryBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;

public class LibraryBooksServiceImpl implements LibraryBooksService {

    @Autowired
    private libraryBooksRepo booksRepository;

    @Override
    public List<LibraryBooks> getAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public LibraryBooks getById(Long bookId) {
        return booksRepository.findById(bookId).get();
    }

    @Override
    public List<LibraryBooks> getByName(String bookName) {
        return booksRepository.findByBookName(bookName);
    }

    @Override
    public LibraryBooks getByLastAdded() {
        List<LibraryBooks> books=booksRepository.findAll();
        return books.get(books.size()-1);
    }

    @Override
    public List<LibraryBooks> getByAuthor(String authorName) {
        return booksRepository.findByAuthor(authorName);
    }

    @Override
    public List<LibraryBooks> getBooksByAscendingOrder() {
        return booksRepository.findAll(Sort.by("bookName"));
    }

    @Override
    public LibraryBooks addBooks(LibraryBooks book) {
        return booksRepository.save(book);
    }

    @Override
    public void deleteById(Long bookId) {
        booksRepository.deleteById(bookId);
    }

    @Override
    public void deleteAllBooks() {
        booksRepository.deleteAll();
    }
}
