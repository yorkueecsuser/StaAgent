import org.junit.Test;
import static org.junit.Assert.*;

public class MutableArrayExampleTest {

    @Test
    public void testShowBug_ModifiesStaticArray() {
        MutableArrayExample example = new MutableArrayExample();
        int[] originalValues = {1, 2, 3, 4, 5};
        int[] newValues = {10, 20, 30, 40, 50};

        // Trigger the bug by modifying the static array
        example.showBug(newValues); // TRIGGER BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

        // Assert that the static array has been modified
        assertNotEquals(originalValues, MutableArrayExample.DEFAULT_VALUES);
        assertArrayEquals(newValues, MutableArrayExample.DEFAULT_VALUES);
    }
}