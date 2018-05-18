package com.oops;

import java.util.List;

public interface BookDao {

    List<Book> findBookByAuthor(String author);
    
}