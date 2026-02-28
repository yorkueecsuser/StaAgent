import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testShowBug() {
        BuggyClass bc = new BuggyClass();
        int size = 10;
        int[] array = bc.showBug(size);

        // Trigger bug: AvoidInstantiatingObjectsInLoops
        // This will trigger the bug because for each iteration in the loop, a new InstanceClass object is created
        for (int i = 1; i < size; i++) {
            assertEquals(array[i - 1], array[i]);
        }
    }
}