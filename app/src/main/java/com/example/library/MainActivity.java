package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    List<Book> books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void bookListClicked(View view){
        Intent bookList = new Intent(this, book_list.class);
        bookList.putExtra("idAdd", false);
        startActivity(bookList);
    }

    public void bookAddClicked(View view){
        Intent addBook = new Intent(this, add_book.class);
        startActivity(addBook);
    }






}