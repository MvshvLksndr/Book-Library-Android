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
        setContentView(R.layout.activity_book_list);


        ArrayList<Book> books = storage.getBookList();

        if(books != null){

            ArrayAdapter<Book> adapter = new ArrayAdapter<Book>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, books);
            ListView lwBooks = findViewById(R.id.lwBooks);

            lwBooks.setAdapter(adapter);
        }

    }
    //вроде больше не нужно но удалять страшно
    void AddNewBook(){
        Bundle args = getIntent().getExtras();
        boolean add = args.getBoolean("isAdd");
        Toast.makeText(this, "Книга не добавлена", Toast.LENGTH_SHORT).show();
        if(add == false) return;
        int year = args.getInt("year");
        String name = args.getString("name");
        String author = args.getString("author");


        
        //books.add(new Book(year, name, author, add));
    }
}