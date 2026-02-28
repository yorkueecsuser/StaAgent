import org.junit.Test;
import static org.junit.Assert.*;

public class AddEmptyStringBugTest {

    @Test
    public void testShowBugWithEmptyStringConcatenation() {
        AddEmptyStringBug bugExample = new AddEmptyStringBug();
        String result = bugExample.showBug(123); // TRIGGER BUG: AddEmptyString
        assertEquals("123", result);
    }

    @Test
    public void testShowBugWithAnotherNumber() {
        AddEmptyStringBug bugExample = new AddEmptyStringBug();
        String result = bugExample.showBug(456); // TRIGGER BUG: AddEmptyString
        assertEquals("456", result);
    }
}