import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayBugTest {
    @Test
    public void testShowBug() {
        ArrayBug buggyClass = new ArrayBug();
        int[] array = {1, 2, 3};
        String result = buggyClass.showBug(array); // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
        assertNotEquals("[I@" + Integer.toHexString(array.hashCode()), result); // Check if the result is not the default toString() output
    }
}