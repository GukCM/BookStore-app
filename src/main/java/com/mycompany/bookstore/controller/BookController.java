package com.mycompany.bookstore.controller;

import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.service.BookService;
import com.mycompany.bookstore.service.impl.BookServiceImpl;


import java.awt.print.Book;


public class BookController {

    private BookService bookService;
    public BookController() {
        bookService =  new BookServiceImpl();
    }


    public Long add(BookDTO book) {
        //Call to service layer add method
        return this.bookService.add(book);

    }
}
