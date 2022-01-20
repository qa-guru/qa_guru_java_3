package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperationsLookupTest {


    @CsvSource({
            "+, сложение",
            "-, вычитание",
            "*, умножение",
            "/, деление"
    })
    @ParameterizedTest
    void lookupTest(char symbol, String expected) {
        Operations result = Operations.lookup(symbol);
        Assertions.assertEquals(expected, result.getImplementation().getName());
    }
}
