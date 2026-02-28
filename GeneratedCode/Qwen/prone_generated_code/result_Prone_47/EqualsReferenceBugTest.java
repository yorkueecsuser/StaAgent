import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsReferenceBugTest {

    @Test
    public void testEqualsInfiniteRecursion() {
        EqualsReferenceBug bug1 = new EqualsReferenceBug("example");
        EqualsReferenceBug bug2 = new EqualsReferenceBug("example");
        assertEquals(bug1, bug2); // TRIGGER BUG: EqualsReference
    }
}