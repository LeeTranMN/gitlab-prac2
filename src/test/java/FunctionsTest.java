import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class FunctionsTest {

    @Test
    public void divideByTwo() {
        double result = Functions.divideByTwo(4);
        assertEquals(result, 2);
    }

    @Test
    public void isWholeNumber() {
        boolean wholeNumber = Functions.isWholeNumber(5.0);
        assertTrue(Functions.isWholeNumber(5.0));
        assertFalse(Functions.isWholeNumber(5.1));
    }
}