import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayComparisonBugTest {

    @Test
    public void testIncompatibleArrayComparison() {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        String[] strArray = {"Hello", "World"};
        StringBuffer[] sbArray = {new StringBuffer("Hello"), new StringBuffer("World")};
        assertTrue(bugDemo.showBug(strArray, sbArray)); // TRIGGER BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)  
    }
}