import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitiveWrapperBugTest {

    @Test
    public void testShowBugTrue() {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        assertEquals("Expected result to be 10", 10, bugDemo.showBug(true).intValue()); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }

    @Test
    public void testShowBugFalse() {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        assertEquals("Expected result to be 10", 10, bugDemo.showBug(false).intValue()); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }
}