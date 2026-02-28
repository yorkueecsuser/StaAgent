import org.junit.Test;
import static org.junit.Assert.*;

public class ClassInitializationBugTest {

    @Test
    public void testShowBug() {
        assertEquals(42, ClassInitializationBug.showBug()); // TRIGGER BUG: Classes should not access their own subclasses during class initialization
    }
}