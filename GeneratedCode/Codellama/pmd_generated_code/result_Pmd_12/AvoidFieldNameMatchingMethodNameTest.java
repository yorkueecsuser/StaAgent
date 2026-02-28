import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidFieldNameMatchingMethodNameTest {
    @Test
    public void testBug() {
        AvoidFieldNameMatchingMethodName avoidFieldNameMatchingMethodName = new AvoidFieldNameMatchingMethodName();
        avoidFieldNameMatchingMethodName.showBug();
        // TRIGGER BUG: AvoidFieldNameMatchingMethodName
        assertEquals("Charlie", avoidFieldNameMatchingMethodName.getName());
    }
}