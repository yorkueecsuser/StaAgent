import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyArrayTest {

    @Test
    public void testShowBug() {
        int[] arr = {1, 2, 3, 4, 5};
        // TRIGGER BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        BuggyArray.showBug(arr, 5);
    }
}