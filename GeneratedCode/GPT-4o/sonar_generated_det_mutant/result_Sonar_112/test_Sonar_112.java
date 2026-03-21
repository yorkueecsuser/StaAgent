import org.junit.Test;
import static org.junit.Assert.*;

public class LoopBugExampleTest {

    @Test
    public void testShowBug() {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        
        // This call should trigger the bug causing an infinite loop or ArrayIndexOutOfBoundsException
        int result = example.showBug(numbers); // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction

        // The expected result is incorrect because the loop doesn't iterate correctly
        assertEquals(15, result); // The test is expected to fail due to the bug
    }
}