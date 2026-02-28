import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHashCodeToStringBugTest {

    @Test
    public void testShowBugWithArray() {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        
        String result = bugDemo.showBug(sampleArray); // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
        // The following assertion is designed to fail because of the bug
        assertEquals("HashCode: [content-specific hash], ToString: [content-specific string]", result);
    }
}