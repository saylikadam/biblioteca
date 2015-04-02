package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class OptionMapper {

    private List<Option> options = new ArrayList<Option>();

    OptionMapper(Library library) {
        initOptionListFor(library);
    }

    private void initOptionListFor(Library library) {
        options.add(new BookList("List Books", library));
        options.add(new BookCheckOut("Checkout Book", library));
        options.add(new ReturnBook("Return Book", library));
        options.add(new Quit("Quit"));
    }

    public Option getExecutive(int option) {
        return options.get(option - 1);
    }

    public StringBuilder getOptionList() {
        StringBuilder optionList = new StringBuilder();
        int counter = 1;

        for (Option option : options) {
            String optionDetails = counter++ + ". " + option.getOptionName() + "\n";
            optionList.append(optionDetails);
        }

        return optionList;
    }
}
