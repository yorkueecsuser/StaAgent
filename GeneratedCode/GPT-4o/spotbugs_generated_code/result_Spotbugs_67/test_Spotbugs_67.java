import org.junit.Test;
import static org.junit.Assert.*;

public class NullDereferenceExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug(null); // TRIGGER BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
    }

    @Test
    public void testShowBugWithTriggerInput() {
        NullDereferenceExample example = new NullDereferenceExample();
        String result = example.showBug("trigger");
        assertEquals("Triggered!", result);
    }
}