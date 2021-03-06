package com.twu.biblioteca;

public class Book {
    private final String name;
    private final String writer;
    private final String year;

    public Book(String name, String writer, String year) {

        this.name = name;
        this.writer = writer;
        this.year =year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        return !(writer != null ? !writer.equals(book.writer) : book.writer != null);

    }

    public String bookDetails() {
        return name+"    "+writer+"    "+year;
    }

    public boolean isName(String bookName) {
        return name.equals(bookName);
    }
}