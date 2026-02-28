import org.junit.Test;
import static org.junit.Assert.*;

public class LoopObjectInstantiationExampleTest {

    @Test
    public void testShowBug() {
        int[] inputValues = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        
        // Call the method that contains the bug
        int[] actual = LoopObjectInstantiationExample.showBug(inputValues); // TRIGGER BUG: AvoidInstantiatingObjectsInLoops

        // This assertion will fail, indicating that the bug is present
        // The bug is not in the logic output, but in the performance due to object instantiation in a loop
        assertArrayEquals(expected, actual);
    }
}