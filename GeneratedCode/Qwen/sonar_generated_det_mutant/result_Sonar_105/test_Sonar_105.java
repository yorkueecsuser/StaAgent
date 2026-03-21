import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {

    @Test
    public void testShowBug() {
        assertEquals(42, Parent.showBug()); // TRIGGER BUG: Classes should not access their own subclasses during class initialization
    }
}