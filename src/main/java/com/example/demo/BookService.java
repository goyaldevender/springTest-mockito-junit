package com.example.demo;

import java.util.List;

public interface BookService {

    List<Book> findBookByAuthor(String author);

}