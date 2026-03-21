import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonBugDemoTest {

    @Test
    public void testShowBug() {
        StringComparisonBugDemo demo = new StringComparisonBugDemo();
        boolean result = demo.showBug();
        assertFalse("The comparison should fail due to reference equality check.", result); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }
}