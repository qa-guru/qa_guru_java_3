package guru.qa.impl;

import guru.qa.Operation;

public class SubOperation extends Operation {
    public SubOperation() {
        super("вычитание", '-');
    }

    @Override
    public int doOperation(int first, int second) {
        return first - second;
    }
}
