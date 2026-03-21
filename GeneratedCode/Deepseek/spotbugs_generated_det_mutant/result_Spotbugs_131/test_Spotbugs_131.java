import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample be = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        int result = be.showBug(array);
        // TRIGGER BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        assertNotEquals(array.hashCode(), result); // Ensure the hashCode is not the same as the array's hashCode
    }
}