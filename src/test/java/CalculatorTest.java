
import junit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    //Example of Assertions of Values
    @Test
    void addNumbers() {
        Calculator calculator = new Calculator();

        // Assertion
        assertEquals(3, calculator.add(1, 2)); // Passes
       // assertNotEquals(3, calculator.add(1, 2)); // Fails
    }

    //Example of Assertions of Custom Error message
    @Test
    void addNumbers1() {
        Calculator calculator = new Calculator();

        // Assertion with a custom message
        // that will be displayed if the test fails
        assertEquals(3, calculator.add(1, 2), "1 + 2 should equal 3");
    }
}
