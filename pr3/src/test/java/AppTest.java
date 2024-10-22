import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(0.0, calculator.add(-2.0, 2.0));
    }

    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
        assertEquals(-5.0, calculator.subtract(2.0, 7.0));
    }

    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
        assertEquals(0.0, calculator.multiply(0.0, 5.0));
    }

    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6.0, 3.0));
        try {
            calculator.divide(1.0, 0.0);
            fail("Expected ArithmeticException not thrown");
        } catch (ArithmeticException e) {
            // Exception is expected
        }
    }

    public void testInvalidInputException() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(1.0, 0.0);
            fail("Expected ArithmeticException not thrown");
        } catch (ArithmeticException e) {
            assertEquals("Ділення на нуль!", e.getMessage());
        }
    }
}
