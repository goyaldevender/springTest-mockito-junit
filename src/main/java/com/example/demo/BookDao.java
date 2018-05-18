package com.example.demo;

import java.util.List;

public interface BookDao {

    List<Book> findBookByAuthor(String author);
    
}