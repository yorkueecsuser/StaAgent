import org.junit.Test;
import static org.junit.Assert.*;

public class MutableArrayBugTest {
    @Test
    public void testModifyArray() {
        MutableArrayBug.modifyArray(0, 10);
        assertEquals("Test failed to trigger the bug: MS: Field is a mutable array (MS_MUTABLE_ARRAY)", 10, MutableArrayBug.ARRAY[0]); // TRIGGER BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

        MutableArrayBug.showBug();
        assertNotEquals("The bug was not triggered correctly in the showBug method", 10, MutableArrayBug.ARRAY[0]); // TRIGGER BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
    }
}