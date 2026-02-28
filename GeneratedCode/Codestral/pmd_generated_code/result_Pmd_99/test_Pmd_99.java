import org.junit.Test;
import static org.junit.Assert.*;

public class AddEmptyStringBugTest {
    @Test
    public void testShowBug() {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        String result = bug.showBug(123); // TRIGGER BUG: AddEmptyString
        assertEquals("123", result);
    }
}