import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testBuggyEquals() {
        BuggyClass obj1 = new BuggyClass("test");
        BuggyClass obj2 = new BuggyClass("test");

        // TRIGGER BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
        assertNotEquals(obj1, obj2);

        obj1.showBug(obj2);
    }
}