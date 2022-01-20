package guru.qa.impl;

import guru.qa.Operation;

public class SumOperation extends Operation {
    public SumOperation() {
        super("сложение", '+');
    }

    @Override
    public int doOperation(int first, int second) {
        return first + second;
    }
}
