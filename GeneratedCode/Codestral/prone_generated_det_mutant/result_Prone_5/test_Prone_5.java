import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ArrayBugTest {

    @Test
    public void testArrayToStringBug() {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        // TRIGGER BUG: ArrayToString
        assertNotEquals(Arrays.toString(arr), bug.showBug(arr));
    }
}