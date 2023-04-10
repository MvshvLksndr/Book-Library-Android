package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class book_list extends AppCompatActivity {

    List<Book> books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);


    }
    void AddNewBook(){
        Bundle args = getIntent().getExtras();
        int year = args.getInt("year");
        String name = args.getString("name");
        String author = args.getString("author");

        Book bookToAdd = new Book(year, name, author);

        books.add(bookToAdd);
    }
}