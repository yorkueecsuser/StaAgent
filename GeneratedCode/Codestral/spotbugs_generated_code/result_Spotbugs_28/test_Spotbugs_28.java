import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyEqualsMethodTest {

    @Test
    public void testShowBug() {
        BuggyEqualsMethod buggyObj = new BuggyEqualsMethod("");
        buggyObj.showBug();
        // TRIGGER BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
        assertEquals("The equals methods are not consistent", buggyObj, new BuggyEqualsMethod("Object"));
    }
}