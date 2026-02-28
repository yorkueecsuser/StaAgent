import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayEqualityBugTest {

    @Test
    public void testShowBugWithSameContentsDifferentReferences() {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        assertFalse(bugDemo.showBug(arrayA, arrayB)); // TRIGGER BUG: ArrayEquals
    }

    @Test
    public void testShowBugWithDifferentContents() {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5, 6};
        assertFalse(bugDemo.showBug(arrayA, arrayB)); // TRIGGER BUG: ArrayEquals
    }

    @Test
    public void testShowBugWithSameReference() {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = arrayA;
        assertTrue(bugDemo.showBug(arrayA, arrayB)); // TRIGGER BUG: ArrayEquals
    }
}