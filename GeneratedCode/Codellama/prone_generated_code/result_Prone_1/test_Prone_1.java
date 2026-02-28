import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysThrowsTest {
    @Test
    public void testShowBug() {
        // Create an empty input array
        int[] inputArray = new int[0];

        // Call the method showBug() with the empty input array
        int[] outputArray = new AlwaysThrows().showBug(inputArray);

        // Assert that the output array is not null and has a length of 0
        assertNotNull(outputArray);
        assertEquals(0, outputArray.length);

        // TRIGGER BUG: AlwaysThrows
        // The bug is triggered when the method showBug() is called with an empty input array
        // The bug is caused by the lack of bounds checking when accessing the array elements
        // The code will throw an ArrayIndexOutOfBoundsException when attempting to access the first element of the empty array
        assertEquals(0, outputArray[0]); // This line will fail and trigger the bug
    }
}