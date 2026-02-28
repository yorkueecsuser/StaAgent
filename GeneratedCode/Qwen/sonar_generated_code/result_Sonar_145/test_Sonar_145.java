import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHashToStringBugTest {

    @Test
    public void testShowBugWithDefaultArrayToStringAndHashcode() {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = bugDemo.showBug(sampleArray); // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
        assertEquals("Expected a specific string representation of the array", "toString: [I@<hashcode>, hashCode: <hashcode>", result);
    }
}