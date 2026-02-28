import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHashcodeBugTest {

    @Test
    public void testShowBugWithDifferentArrays() {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {3, 2, 1};

        // These assertions will fail because the hashCode method on arrays does not consider the contents
        assertEquals(bugDemo.showBug(array1), bugDemo.showBug(array2)); // TRIGGER BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        assertNotEquals(bugDemo.showBug(array1), bugDemo.showBug(array3)); // TRIGGER BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }
}