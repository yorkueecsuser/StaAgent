import org.junit.Test;
import static org.junit.Assert.*;

public class MutableArrayExampleTest {

    @Test
    public void testShowBugMethod() {
        // Create a copy of the original numbers array
        int[] originalNumbers = MutableArrayExample.getNumbers().clone();

        // Call the showBug method to modify the array
        MutableArrayExample.showBug(); // TRIGGER BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

        // Retrieve the modified numbers array
        int[] modifiedNumbers = MutableArrayExample.getNumbers();

        // Verify that the first element of the array has been changed
        assertFalse("The first element of the array should have been modified.", originalNumbers[0] == modifiedNumbers[0]);
    }

    @Test
    public void testArrayModification() {
        // Access the numbers array directly and modify it
        MutableArrayExample.numbers[0] = 42; // TRIGGER BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

        // Verify the modification
        assertEquals("Array modification should reflect the new value.", 42, MutableArrayExample.getNumbers()[0]);
    }
}