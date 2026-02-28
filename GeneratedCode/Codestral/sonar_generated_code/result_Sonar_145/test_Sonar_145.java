import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayBugTest {
    @Test
    public void testShowBug() {
        ArrayBug buggyObject = new ArrayBug();
        int[] testArray = {1, 2, 3};
        // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
        String result = buggyObject.showBug(testArray).toString();
        assertFalse("hashCode and toString should not be called directly on the array",
                result.equals(testArray.hashCode() + " " + testArray.toString()));
    }
}