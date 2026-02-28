import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceExampleTest {

    @Test
    public void testShowBugWithZeroDivisor() {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        // TRIGGER BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        example.showBug(0); // This line will trigger the bug by causing a NullPointerException
    }
    
    @Test
    public void testShowBugWithNonZeroDivisor() {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        String result = example.showBug(2); // Should not trigger the bug
        assertNotNull(result);
        assertEquals("Result is: 5", result);
    }
}