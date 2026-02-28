import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {

    @Test
    public void testShowBug() {
        Parent.showBug(); // TRIGGER BUG: Classes should not access their own subclasses during class initialization
        assertEquals(42, Parent.field1); // This assertion will fail as field1 is initialized with 0 due to the bug
    }
}