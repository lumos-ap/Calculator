import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRootTruePositive() {
        assertEquals("Testing True Positive for squareRoot", 8.0, c.squareRoot(64.0), delta);
    }
    @Test
    public void squareRootTrueNegative() {
        assertEquals("Testing True Negative for squareRoot", Double.NaN, c.squareRoot(-9.0), delta);
    }
    @Test
    public void squareRootFalseNegative() {
        assertNotEquals("Testing False Negative for squareRoot", 6.0, c.squareRoot(-24.0), delta);
    }
    @Test
    public void squareRootFalsePositive() {
        assertNotEquals("Testing False Positives for squareRoot", Double.NaN, c.squareRoot(36.0), delta);
    }

    @Test
    public void factorialTruePositive() {
        assertEquals("Testing True Positive for factorial", 120.0, c.factorial(5), delta);
    }
    @Test
    public void factorialTrueNegative() {
        assertEquals("Testing True Negative for factorial", Double.NaN, c.factorial(-9), delta);
    }
    @Test
    public void factorialFalseNegative() {
        assertNotEquals("Testing False Negative for factorial", 6.0, c.factorial(-24), delta);
    }
    @Test
    public void factorialFalsePositive() {
        assertNotEquals("Testing False Positives for factorial", Double.NaN, c.factorial(3), delta);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Testing True Positive for power function", 125.0, c.power(5,3), delta);
    }
    @Test
    public void powerTrueNegative() {
        assertEquals("Testing True Negative for power function", 81.0, c.power(-9,2), delta);
    }
    @Test
    public void powerFalseNegative() {
        assertNotEquals("Testing False Negative for power function", 6.0, c.power(5,3), delta);
    }
    @Test
    public void powerFalsePositive() {
        assertNotEquals("Testing False Positives for power function", 4, c.power(-9,3), delta);
    }

    @Test
    public void logarithmicTruePositive() {
        assertEquals("Testing True Positive for logarithmic function", 2.302585092994046, c.logarithmic(10), delta);
    }
    @Test
    public void logarithmicTrueNegative() {
        assertEquals("Testing True Negative for logarithmic function", Double.NaN, c.logarithmic(-9), delta);
    }
    @Test
    public void logarithmicFalseNegative() {
        assertNotEquals("Testing False Negative for logarithmic function", 6, c.logarithmic(10), delta);
    }
    @Test
    public void logarithmicFalsePositive() {
        assertNotEquals("Testing False Positives for logarithmic function", 4, c.logarithmic(-9), delta);
    }


}
