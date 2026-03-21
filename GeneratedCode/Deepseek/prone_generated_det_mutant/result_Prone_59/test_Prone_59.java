import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testEqualsMethod() {
        BugExample.FuzzyEqualsObject obj1 = new BugExample.FuzzyEqualsObject(0.1);
        BugExample.FuzzyEqualsObject obj2 = new BugExample.FuzzyEqualsObject(0.10000001);
        assertFalse(obj1.equals(obj2)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}