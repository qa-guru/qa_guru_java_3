package guru.qa;

import guru.qa.mock.MockReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator testedObj = new Calculator(new MockReader());

    @Test
    void run() {
        String run = testedObj.run();
        Assertions.assertEquals("Результат: 25", run);
    }
}