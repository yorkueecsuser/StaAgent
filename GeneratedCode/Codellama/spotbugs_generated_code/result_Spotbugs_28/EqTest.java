import org.junit.Test;
import static org.junit.Assert.*;

public class EqTest {
    @Test
    public void testEquals_other() {
        Eq eq1 = new Eq(1, "abc");
        Eq eq2 = new Eq(1, "abc");
        assertTrue(eq1.equals(eq2));
    }

    @Test
    public void testEquals_other_fail() {
        Eq eq1 = new Eq(1, "abc");
        Eq eq2 = new Eq(2, "def");
        assertFalse(eq1.equals(eq2));
    }

    @Test
    public void testEquals_other_exception() {
        Eq eq1 = new Eq(1, "abc");
        Object obj = new Object();
        assertFalse(eq1.equals(obj));
    }
}