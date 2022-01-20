package guru.qa.impl;

import guru.qa.Operation;

public class DivOperation extends Operation {
    public DivOperation() {
        super("деление", '/');
    }

    @Override
    public int doOperation(int first, int second) {
        return first / second;
    }
}
