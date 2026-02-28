import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitiveWrapperBugTest {

    @Test
    public void testShowBugWithTrueCondition() {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        assertEquals(100.0f, bugDemo.showBug(true), 0.001f); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }

    @Test
    public void testShowBugWithFalseCondition() {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        assertEquals(100.5f, bugDemo.showBug(false), 0.001f); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }
}