import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugExampleTest {

    @Test
    public void testShowBugWithNullReturn() {
        OptionalBugExample example = new OptionalBugExample();
        assertEquals("Null Returned", example.showBug(true)); // TRIGGER BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL) 
    }

    @Test
    public void testShowBugWithoutNullReturn() {
        OptionalBugExample example = new OptionalBugExample();
        assertEquals("Valid Value", example.showBug(false));
    }
}