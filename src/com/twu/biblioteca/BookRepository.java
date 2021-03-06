package com.twu.biblioteca;

public class BookRepository {

    private final String booksPath;

    public BookRepository(String booksPath) {

        this.booksPath = booksPath;
    }

    void initiateLibrary(Library library) {
        FileScanner fileScanner = new FileScanner(booksPath);
        String contents = fileScanner.read();
        String[] lines = contents.split(System.lineSeparator());
        for (String line : lines) {
            String[] values = splitByComma(line);
            library.initiateList(new Book(values[0], values[1], values[2]));
        }
    }

    String[] splitByComma(String line) {
        String[] words = line.split(",");
        String[] updatedWords = new String[words.length];
        for (int count = 0; count < words.length; count++) {
            updatedWords[count] = words[count].trim();
        }
        return updatedWords;
    }
}