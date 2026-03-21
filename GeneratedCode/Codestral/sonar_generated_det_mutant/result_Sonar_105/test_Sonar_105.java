import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {
    @Test
    public void showBugTest() {
        Parent.showBug(); // TRIGGER BUG: Classes should not access their own subclasses during class initialization
        assertEquals(0, Parent.field1); // Bug triggered here. Expected 42, but got 0.
    }
}