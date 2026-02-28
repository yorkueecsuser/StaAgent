import org.junit.Test;
import static org.junit.Assert.*;

public class EqAlwaysFalseExampleTest {

    @Test
    public void testEqualsReflexivity() {
        EqAlwaysFalseExample obj1 = new EqAlwaysFalseExample(10);
        assertEquals(1, obj1.showBug(obj1)); // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    @Test
    public void testEqualsNonReflexivity() {
        EqAlwaysFalseExample obj1 = new EqAlwaysFalseExample(10);
        EqAlwaysFalseExample obj2 = new EqAlwaysFalseExample(10);
        assertEquals(1, obj1.showBug(obj2)); // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }
}