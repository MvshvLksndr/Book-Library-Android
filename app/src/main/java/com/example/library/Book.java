package com.example.library;

public class Book {
    int Year;
    String Name;
    String Author;
    Book(int year, String name, String author){
            Year = year;
            Name = name;
            Author = author;
        }

    public  String GetName(){
        return this.Name;
    }
    public  String GetAuthor(){
        return this.Author;
    }
    public  int GetYear(){
        return  this.Year;
    }
}
