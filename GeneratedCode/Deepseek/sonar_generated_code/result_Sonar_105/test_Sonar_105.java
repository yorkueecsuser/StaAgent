import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {
    @Test
    // TRIGGER BUG: Classes should not access their own subclasses during class initialization
    public void testBug() {
        Parent.showBug(); // This line triggers the bug
    }
}