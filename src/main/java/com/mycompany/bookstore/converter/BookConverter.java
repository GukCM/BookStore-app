package com.mycompany.bookstore.converter;

import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.entity.BookEntity;

public class BookConverter {

    public static BookEntity convertBookDTOtoBookEntity(BookDTO bookDTO) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setAuthorEmail(bookDTO.getAuthorEmail());
        bookEntity.getAuthorName(bookDTO.getAuthorName());
        bookEntity.setAvailableQty(bookDTO.getAvailableQty());
        bookEntity.setBookID(bookDTO.getBookID());
        bookEntity.setDescription(bookDTO.getDescription());
        bookEntity.setName(bookDTO.getName());
        bookEntity.setPricePerQty(bookDTO.getPricePerQty());
        return bookEntity;
    }
}
