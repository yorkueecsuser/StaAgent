import org.junit.Test;
import static org.junit.Assert.*;

public class ForLoopBugTest {
    @Test
    public void testShowBug() {
        ForLoopBug buggyClass = new ForLoopBug();
        int[] result = buggyClass.showBug(0, 5); // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
        // Verify that the result is not as expected due to the bug
        for (int i = 0; i <= 5; i++) {
            assertEquals("Array value at index " + i + " is not as expected", i, result[i]);
        }
    }
}