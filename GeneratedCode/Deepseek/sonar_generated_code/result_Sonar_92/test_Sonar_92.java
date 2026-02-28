import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bug = new BugExample();

    @Test // TRIGGER BUG: Unary prefix operators should not be repeated
    public void testShowBug() {
        double[] array = {1.0, -2.0, 3.3, -4.4, 5.5};
        double[] result = bug.showBug(array);
        assertArrayEquals(new double[]{-1.0, 2.0, -3.3, 4.4, -5.5}, result, 0.001);
    }

    @Test // TRIGGER BUG: Unary prefix operators should not be repeated
    public void testShowBug1() {
        double num = bug.showBug1(5);
        assertEquals(-5, num, 0.001);
    }

    @Test // TRIGGER BUG: Unary prefix operators should not be repeated
    public void testShowBug2() {
        boolean b = bug.showBug2(true);
        assertFalse(b);
    }

    @Test // TRIGGER BUG: Unary prefix operators should not be repeated
    public void testShowBug3() {
        int i = bug.showBug3(5);
        assertEquals(6, i);
    }
}