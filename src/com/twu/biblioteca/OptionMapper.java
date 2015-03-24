package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class OptionMapper {

    private List<Option> options = new ArrayList<Option>();

    OptionMapper(Library library, Librarian librarian) {
        initiateList(library, librarian);
    }

    private void initiateList(Library library, Librarian librarian) {
        options.add(new BookList(library, librarian));
        options.add(new BookCheckOut(library, librarian));
        options.add(new Quit(library, librarian));
    }

    public Option getExecutive(int option) {
        return options.get(option - 1);
    }
}
