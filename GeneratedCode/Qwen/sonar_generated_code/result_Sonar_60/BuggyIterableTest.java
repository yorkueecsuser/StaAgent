import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIterableTest {

    @Test
    public void testMultipleIterations() {
        BuggyIterable buggyIterable = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        
        // First iteration
        StringBuilder firstIteration = new StringBuilder();
        for (Integer num : buggyIterable) {
            firstIteration.append(num).append(" ");
        }
        
        // Second iteration
        StringBuilder secondIteration = new StringBuilder();
        for (Integer num : buggyIterable) { // TRIGGER BUG: "iterator" should not return "this"
            secondIteration.append(num).append(" ");
        }
        
        // Assert that the second iteration does not produce any output
        assertFalse("Second iteration should be empty due to shared iterator state", secondIteration.toString().trim().isEmpty());
    }
}