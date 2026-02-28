import org.junit.Test;
import static org.junit.Assert.*;

public class ForLoopBugTest {
    @Test
    public void testShowBug() {
        ForLoopBug buggyClass = new ForLoopBug();
        int[] result = buggyClass.showBug();
        // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
        for (int i = 0; i < result.length; i++) {
            assertEquals("Element at index " + i + " should be " + i, i, result[i]);
        }
    }
}