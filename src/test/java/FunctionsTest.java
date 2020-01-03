import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class FunctionsTest {

    @Test
    public void divideByTwo() {
        double result = Functions.divideByTwo(4);
        assertEquals(result, 2);
    }
}