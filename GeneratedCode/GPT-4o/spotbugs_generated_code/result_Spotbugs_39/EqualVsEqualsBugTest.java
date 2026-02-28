import org.junit.Test;
import static org.junit.Assert.*;

public class EqualVsEqualsBugTest {

    @Test
    public void testShowBugWithEqualObjects() {
        EqualVsEqualsBug obj1 = new EqualVsEqualsBug("Example");
        EqualVsEqualsBug obj2 = new EqualVsEqualsBug("Example");

        boolean result = obj1.showBug(obj2); // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        assertTrue("Expected obj1 to equal obj2 using showBug method", result);
    }

    @Test
    public void testShowBugWithDifferentObjects() {
        EqualVsEqualsBug obj1 = new EqualVsEqualsBug("Example1");
        EqualVsEqualsBug obj2 = new EqualVsEqualsBug("Example2");

        boolean result = obj1.showBug(obj2); // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        assertFalse("Expected obj1 not to equal obj2 using showBug method", result);
    }

    @Test
    public void testShowBugWithNullObject() {
        EqualVsEqualsBug obj1 = new EqualVsEqualsBug("Example");

        boolean result = obj1.showBug(null); // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        assertFalse("Expected obj1 not to equal null using showBug method", result);
    }
}