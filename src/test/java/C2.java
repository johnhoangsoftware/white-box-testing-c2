import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
Branch Coverage Criterion
 */

public class C2 {

    @Test
    public void test1() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(3, 2);
        assertTrue(result);
    }

    @Test
    public void test2() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(5, 3);
        assertFalse(result);
    }

    @Test
    public void test3() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(3, 6);
        assertFalse(result);
    }
}
