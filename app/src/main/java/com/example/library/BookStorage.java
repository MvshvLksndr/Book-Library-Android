package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class BookStorage {

    //жесть умная штука. Создает 1 инатснс на весь проект, и выдает его, если он уже создан
    private static BookStorage instance = null;
    private ArrayList<Book> BookList = new ArrayList<>();


    public static BookStorage getInstance() {
        if (instance == null) {
            instance = new BookStorage();
        }
        return instance;
    }

    public ArrayList<Book> getBookList() {
        return BookList;
    }

    public void addBook(Book book) {
        BookList.add(book);
    }
}
