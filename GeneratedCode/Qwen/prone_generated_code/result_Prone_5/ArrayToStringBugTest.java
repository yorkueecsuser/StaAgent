import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ArrayToStringBugTest {

    @Test
    public void testShowBugWithIncorrectOutput() {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String expectedOutput = Arrays.toString(sampleArray);
        String actualOutput = bugDemo.showBug(sampleArray); // TRIGGER BUG: ArrayToString
        assertEquals(expectedOutput, actualOutput);
    }
}