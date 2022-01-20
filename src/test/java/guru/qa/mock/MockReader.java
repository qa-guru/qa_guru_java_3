package guru.qa.mock;

import guru.qa.Operation;
import guru.qa.Operations;
import guru.qa.Reader;

public class MockReader implements Reader {
    @Override
    public int readFirst() {
        return 15;
    }

    @Override
    public int readSecond() {
        return 10;
    }

    @Override
    public Operation readOperation() {
        return Operations.SUM.getImplementation();
    }
}
