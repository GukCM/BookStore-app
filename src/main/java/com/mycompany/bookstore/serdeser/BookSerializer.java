package com.mycompany.bookstore.serdeser;

import com.mycompany.bookstore.entity.BookEntity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookSerializer {
    public static void serializeBook(BookEntity bookEntity){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(bookEntity.getBookID() + ".ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(bookEntity);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
