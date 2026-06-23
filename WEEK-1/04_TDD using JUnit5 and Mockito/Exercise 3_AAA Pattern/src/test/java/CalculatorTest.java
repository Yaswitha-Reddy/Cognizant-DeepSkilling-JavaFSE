import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    // Setup method
    @Before
    public void setUp() {
        System.out.println("Setup Method");
        calculator = new Calculator();
    }

    // Test using AAA Pattern
    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Teardown method
    @After
    public void tearDown() {
        System.out.println("Teardown Method");
    }
}