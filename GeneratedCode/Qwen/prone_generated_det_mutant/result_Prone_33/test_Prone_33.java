import org.junit.Test;
import static org.junit.Assert.*;

public class NullDereferenceExampleTest {

    @Test
    public void testShowBugWithNonNullInput() {
        NullDereferenceExample example = new NullDereferenceExample();
        assertEquals("5 characters", example.showBug("Hello"));
    }

    @Test
    public void testShowBugWithNullInput() {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug(null); // TRIGGER BUG: DereferenceWithNullBranch
    }
}