import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayEqualsBugTest {
    @Test
    public void testShowBug() {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        // TRIGGER BUG: ArrayEquals
        assertFalse(bug.showBug(arr1, arr2));
    }
}