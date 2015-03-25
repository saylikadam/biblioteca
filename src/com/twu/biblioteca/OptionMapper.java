package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class OptionMapper {

    private List<Option> options = new ArrayList<Option>();

    OptionMapper(Library library) {
        initiateList(library);
    }

    private void initiateList(Library library) {
        options.add(new BookList(library));
        options.add(new BookCheckOut(library));
        options.add(new ReturnBook(library));
        options.add(new Quit());
    }

    public Option getExecutive(int option) {
        return options.get(option - 1);
    }
}
