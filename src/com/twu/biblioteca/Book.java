package com.twu.biblioteca;

/**
 * Created by ankurks on 3/21/2015.
 */
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
        if (writer != null ? !writer.equals(book.writer) : book.writer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name+"    "+writer+"    "+year;
    }
}