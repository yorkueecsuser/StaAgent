import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {

    @Test
    public void testShowBugTrigger() {
        Parent parent = new Parent(); // TRIGGER BUG: Classes should not access their own subclasses during class initialization
        int result = parent.showBug(); // TRIGGER BUG: Classes should not access their own subclasses during class initialization
        assertEquals(42, result); // This assertion will fail due to the bug
    }
}