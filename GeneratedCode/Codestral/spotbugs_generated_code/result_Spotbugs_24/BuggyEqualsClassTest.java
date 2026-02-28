import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyEqualsClassTest {

    @Test
    public void testEqualsMethod() {
        BuggyEqualsClass obj1 = new BuggyEqualsClass(5);
        BuggyEqualsClass obj2 = new BuggyEqualsClass(5);

        // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        assertNotEquals(obj1, obj2);
    }

    @Test
    public void testShowBugMethod() {
        BuggyEqualsClass buggyEqualsClass = new BuggyEqualsClass(5);

        // TRIGGER BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        buggyEqualsClass.showBug();
    }
}