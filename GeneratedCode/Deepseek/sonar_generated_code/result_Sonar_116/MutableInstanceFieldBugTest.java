import org.junit.Test;
import static org.junit.Assert.*;

public class MutableInstanceFieldBugTest {
    private MutableInstanceFieldBug testObject = new MutableInstanceFieldBug();

    @Test // TRIGGER BUG: Servlets should not have mutable instance fields
    public void testShowBug() {
        String expected = "This is a mutable field that has been changed";
        String actual = testObject.showBug();
        assertEquals(expected, actual);
    }
}