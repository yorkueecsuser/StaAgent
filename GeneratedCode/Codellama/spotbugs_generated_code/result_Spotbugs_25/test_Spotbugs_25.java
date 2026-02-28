import org.junit.Test;
import static org.junit.Assert.*;

public class EqBugTest {
    @Test
    public void testEquals() {
        A a = new A(1);
        B b = new B(1, 2);
        assertTrue(a.equals(b)); // TRIGGER BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC)
    }
}