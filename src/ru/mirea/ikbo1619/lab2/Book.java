package ru.mirea.ikbo1619.lab2;

public class Book {
    private int number_of_pages;
    private String author;

    public Book(int number_of_pages,String author) {
        this.number_of_pages = number_of_pages;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number_of_pages=" + number_of_pages +
                ", author='" + author + '\'' +
                '}';
    }
}
