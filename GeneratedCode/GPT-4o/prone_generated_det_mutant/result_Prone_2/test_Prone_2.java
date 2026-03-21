import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayEqualityCheckerTest {

    @Test
    public void testShowBug() {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // This test should fail because the bug causes reference equality to be checked
        assertTrue(checker.showBug(array1, array2)); // TRIGGER BUG: ArrayEquals
    }
}