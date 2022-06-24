package com.greatlearning.librarymanagementsystem.controller;


import com.greatlearning.librarymanagementsystem.entity.LibraryBooks;
import com.greatlearning.librarymanagementsystem.service.LibraryBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class LibraryBooksController {

    @Autowired
    private LibraryBooksService booksService;

    @PostMapping(path = "/book")
    public LibraryBooks addBooks(@RequestBody LibraryBooks book){
        return booksService.addBooks(book);
    }

    @GetMapping(path = "/books")
    public List<LibraryBooks> getAllBooks(){
        return booksService.getAllBooks();
    }

    @GetMapping(path = "/book/{bookId}")
    public LibraryBooks getBookById(@PathVariable("bookId") Long bookId){
        return booksService.getById(bookId);
    }

    @GetMapping(path = "/books/name/{bookName}")
    public List<LibraryBooks> getBookByName(@PathVariable("bookName") String bookName){
        return booksService.getByName(bookName);
    }

    @GetMapping(path = "/books/author/{authorName}")
    public List<LibraryBooks> getBookByAuthorName(@PathVariable("authorName") String authorName){
        return booksService.getByAuthor(authorName);
    }

    @GetMapping(path = "/booksByAsc")
    public List<LibraryBooks> getBooksByAscendingOrder(){
        return  booksService.getBooksByAscendingOrder();
    }

    @GetMapping(path = "/booksByLast")
    public LibraryBooks getBooksByLastAdded(){
        return booksService.getByLastAdded();
    }

    @DeleteMapping(path = "/deleteById")
    public void deleteById(@PathVariable("bookId") Long bookId){
        booksService.deleteById(bookId);
    }

    @DeleteMapping(path = "/deleteBooks")
    public void deleteAllBooks(){
        booksService.deleteAllBooks();
    }






}
