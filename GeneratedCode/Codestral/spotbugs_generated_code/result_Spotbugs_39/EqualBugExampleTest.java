import org.junit.Test;
import static org.junit.Assert.*;

public class EqualBugExampleTest {
    @Test
    public void testEqualBug() {
        EqualBugExample obj1 = new EqualBugExample("Test");
        EqualBugExample obj2 = new EqualBugExample("Test");

        // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        obj1.showBug(obj2);
        assertNotEquals(obj1, obj2);
    }
}