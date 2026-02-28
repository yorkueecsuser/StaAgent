import org.junit.Test;
import static org.junit.Assert.*;

public class AddEmptyStringBugTest {
    @Test
    public void testShowBug() {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        String[] arr = bug.showBug();

        // TRIGGER BUG: AddEmptyString
        // Expected bug: The string array should contain the strings "0", "1", "2", "3", "4"
        // but instead, it contains the strings "", "1", "2", "3", "4"
        // This is because the empty string is being concatenated to the integer causing unnecessary object creation.

        assertEquals("", arr[0]);
        assertEquals("1", arr[1]);
        assertEquals("2", arr[2]);
        assertEquals("3", arr[3]);
        assertEquals("4", arr[4]);
    }
}