import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToStringBugTest {
    @Test
    public void testBugTrigger() {
        int[] numbers = {1, 2, 3, 4, 5};
        String result = Arrays.toString(numbers);
        assertEquals("[1, 2, 3, 4, 5]", result); // TRIGGER BUG: ArrayToString
    }
}