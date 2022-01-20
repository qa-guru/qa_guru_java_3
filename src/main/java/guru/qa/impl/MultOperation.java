package guru.qa.impl;

import guru.qa.Operation;

public class MultOperation extends Operation {
    public MultOperation() {
        super("умножение", '*');
    }

    @Override
    public int doOperation(int first, int second) {
        return Math.multiplyExact(first, second);
    }
}
