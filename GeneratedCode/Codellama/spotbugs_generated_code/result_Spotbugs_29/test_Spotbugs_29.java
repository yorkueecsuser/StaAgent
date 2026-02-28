import org.junit.Test;
import static org.junit.Assert.*;

public class EqTest {
    @Test
    public void testEquals() {
        Eq eq1 = new Eq(1);
        Eq eq2 = new Eq(2);
        Eq eq3 = new Eq(1);
        
        assertFalse(eq1.equals(eq2)); // TRIGGER BUG: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
        assertTrue(eq1.equals(eq3));
    }
}