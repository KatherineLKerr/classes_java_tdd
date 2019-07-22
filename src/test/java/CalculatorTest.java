import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before () {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5.0, calculator.add(3.0, 2.0), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(2.0, calculator.subtract(10.0, 8.0), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(2.0, calculator.divide(10.0, 5.0), 0.01);
    }
}
