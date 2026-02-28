import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayComparisonBugTest {

    @Test
    public void testShowBugWithArrayAndString() {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] sampleArray = {1, 2, 3};
        String sampleString = "123";
        assertFalse(bugDemo.showBug(sampleArray, sampleString)); // TRIGGER BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }
}