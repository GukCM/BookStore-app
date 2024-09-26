package com.mycompany.bookstore.repository.impl;

import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;
import com.mycompany.bookstore.serdeser.BookSerializer;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryimpl implements BookRepository {

    @Override
    public Long add(BookEntity bookEntity) {
        BookSerializer.serializeBook(bookEntity);

        return bookEntity.getBookID();
    }
}
