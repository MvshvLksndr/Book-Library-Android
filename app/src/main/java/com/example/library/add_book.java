package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class add_book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);


    }

    void AddBook(int year, String name, String author){

        Intent bookList = new Intent(this, book_list.class);
        bookList.putExtra("year", year);
        bookList.putExtra("name", name);
        bookList.putExtra("author", author);
    }
}