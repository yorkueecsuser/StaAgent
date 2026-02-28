import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalNullBugTest {

    @Test
    public void testShowBug() {
        OptionalNullBug bugDemo = new OptionalNullBug();
        assertEquals("Default Value", bugDemo.showBug()); // TRIGGER BUG: "null" should not be used with "Optional"
    }
}