import org.junit.Test;
import static org.junit.Assert.*;

public class InvariantCallBugTest {
    @Test
    public void testInvariantCallBug() {
        InvariantCallBug buggyClass = new InvariantCallBug();
        int size = 5;

        for(int i = 0; i < size; i++) {
            // Modifying the values of x and y within the loop to trigger the bug
            buggyClass.invariant_hoist(size);
            size++;
        }

        // TRIGGER BUG: INVARIANT_CALL - Modifying the loop variable inside the loop violates the invariant property
        assertEquals(5, buggyClass.showBug(size));
    }
}