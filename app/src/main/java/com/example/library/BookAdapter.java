package com.example.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Book> books;

    public BookAdapter(Context context, int resource, ArrayList<Book> books) {
        super(context, resource, books);
        this.books = books;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView ==null) convertView = inflater.inflate(this.layout, parent, false);


        TextView authorView = convertView.findViewById(R.id.bookAuthorTW);
        TextView nameView = convertView.findViewById(R.id.bookNameTW);
        TextView yearView = convertView.findViewById(R.id.bookYearTW);

        Book book = books.get(position);


        nameView.setText(book.getName());
        yearView.setText(book.getYear());
        authorView.setText(book.getAuthor());

        return convertView;
    }
}
