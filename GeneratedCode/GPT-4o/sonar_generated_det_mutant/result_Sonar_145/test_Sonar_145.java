import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMethodBugExampleTest {

    @Test
    public void testShowBug() {
        ArrayMethodBugExample example = new ArrayMethodBugExample();
        int[] sampleArray = {1, 2, 3};
        String output = example.showBug(sampleArray); // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
        String expectedHashCodeLine = "Array hashCode: " + sampleArray.hashCode(); // Expected incorrect value from hashCode
        String expectedToStringLine = "Array toString: " + sampleArray.toString(); // Expected incorrect value from toString

        // Check if output contains the incorrect lines
        assertTrue("Output did not match expected hashCode line", output.contains(expectedHashCodeLine));
        assertTrue("Output did not match expected toString line", output.contains(expectedToStringLine));
        // The above assertions are expected to fail as they rely on incorrect assumptions about array behavior
    }
}