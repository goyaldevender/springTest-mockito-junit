package com.example.demo;

public class FakeBookValidatorService implements BookValidatorService {

    @Override
    public boolean isValid(Book book) {
        if (book == null)
            return false;

        if ("bot".equals(book.getName()))
            return false;

        return true;

    }
}