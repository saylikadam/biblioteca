package com.twu.biblioteca;

import java.io.IOException;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class FileScanner {
    private String path;

    public FileScanner(String path) {
        this.path = path;
    }

    public String read() {
        try {
            return new String(readAllBytes(get(path)));
        } catch (IOException e) {
            System.out.println("File not Found");
        }

        return null;
    }
}
