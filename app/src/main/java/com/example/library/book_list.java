package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class book_list extends AppCompatActivity {

    BookStorage storage = BookStorage.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_book_list);


        ArrayList<Book> books = storage.getBookList();

        if(books != null){

            BookAdapter adapter = new BookAdapter(this, R.layout.book_list_item, books);

            ListView lwBooks = findViewById(R.id.lwBooks);

            lwBooks.setAdapter(adapter);
        }
    }

}