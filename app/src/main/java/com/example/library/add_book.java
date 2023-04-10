package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class add_book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        EditText etYear = findViewById(R.id.bookYear);
        EditText etAuthor = findViewById(R.id.bookAuthor);
        EditText etName = findViewById(R.id.bookName);

        Button button = (Button) findViewById(R.id.AddBookButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Year = Integer.parseInt(etYear.getText().toString());
                String Author = etAuthor.getText().toString();
                String Name = etName.getText().toString();

                AddBook(Year, Name, Author);
            }
        });
    }



    void AddBook(int year, String name, String author){

        Intent bookList = new Intent(this, MainActivity.class);
        bookList.putExtra("year", year);
        bookList.putExtra("name", name);
        bookList.putExtra("author", author);
    }
}