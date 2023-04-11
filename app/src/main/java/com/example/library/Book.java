package com.example.library;

public class Book {
    int Year;
    String Name;
    String Author;
    boolean Add = false;
    Book(int year, String name, String author, boolean add){

            Year = year;
            Name = name;
            Author = author;
            Add = add;
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

    @Override
    public String toString() {
        return "Book{" +
                "Year=" + Year +
                ", Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
