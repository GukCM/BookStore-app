package com.mycompany.bookstore.testing;

import com.mycompany.bookstore.controller.BookController;
import com.mycompany.bookstore.dto.BookDTO;

public class BookClient {
    public static void main(String[] args) {
        //Create an object
        BookController controller = new BookController();
        //Create the BookDTO and call the controller add book method
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookID(111L);
        bookDTO.setAuthorEmail("author@email.com");
        bookDTO.setAuthorName("authorName");
        bookDTO.setAvailableQty(10);
        bookDTO.setName("bookName");
        bookDTO.setDescription("bookDescription");
        bookDTO.setPricePerQty(10.99);

        //Call controller add method and method and hold the return value
        Long bookID = controller.add(bookDTO);
        if(bookID != null) {
        System.out.println("Book was successfully created with Id: " + bookID);
        }else{
            System.out.println("Book was not created");
        }
    }
}
