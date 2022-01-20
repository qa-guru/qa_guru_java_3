package guru.qa;

import guru.qa.impl.DivOperation;
import guru.qa.impl.MultOperation;
import guru.qa.impl.SubOperation;
import guru.qa.impl.SumOperation;

public enum Operations {
    SUM(new SumOperation()),
    MULT(new MultOperation()),
    DIV(new DivOperation()),
    SUB(new SubOperation());

    private final Operation operation;

    Operations(Operation operation) {
        this.operation = operation;
    }

    public Operation getImplementation() {
        return operation;
    }

    public static Operations lookup(char symbol) {
        for (Operations value : values()) {
            if (value.getImplementation().getSymbol() == symbol)
                return value;
        }
        throw new IllegalArgumentException("Incorrect symbol: " + symbol);
    }
}
