import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysTrueClassTest {
    @Test
    public void testEqualsMethod() {
        AlwaysTrueClass obj1 = new AlwaysTrueClass("Test");
        AlwaysTrueClass obj2 = new AlwaysTrueClass("Different Test");

        // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        obj1.showBug(obj2);
        assertNotEquals(obj1, obj2);
    }
}