package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class add_book extends AppCompatActivity {

    BookStorage storage = BookStorage.getInstance();
    ArrayList<Book> books = storage.getBookList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);


    }
    public void addBookClicked(View view){
        EditText year = findViewById(R.id.bookYear);
        String strYear =year.getText().toString();

        if(strYear.trim().length() == 0){
            Toast.makeText(this, "Введите год!", Toast.LENGTH_SHORT).show();
            return;
        }
        int intYear = Integer.parseInt(strYear);

        EditText name = findViewById(R.id.bookName);
        String strName = name.getText().toString();

        if(strName.trim().length() == 0){
            Toast.makeText(this, "Введите название!", Toast.LENGTH_SHORT).show();
            return;
        }

        EditText author = findViewById(R.id.bookAuthor);
        String stAuthor = author.getText().toString();

        if(stAuthor.trim().length() == 0){
            Toast.makeText(this, "Введите автора!", Toast.LENGTH_SHORT).show();
            return;
        }

        storage.addBook(new Book(intYear, strName, stAuthor));

        Toast.makeText(this, "Книга добавлена в список!", Toast.LENGTH_SHORT).show();
        finish();
        //AddBook(1, strName, stAuthor);
    }
}