package com.example.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter {

    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Book> books;

    public BookAdapter(Context context, int resource, ArrayList<Book> states) {
        //super(context, resource, states);
        this.books = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        TextView authorView = view.findViewById(R.id.bookAuthorTW);
        TextView nameView = view.findViewById(R.id.bookNameTW);
        TextView yearView = view.findViewById(R.id.bookYearTW);

        Book book = books.get(position);


        nameView.setText(book.getName());
        yearView.setText(book.getYear());
        authorView.setText(book.getAuthor());

        return view;
    }
}
