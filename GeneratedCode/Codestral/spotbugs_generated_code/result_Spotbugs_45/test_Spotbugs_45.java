import org.junit.Test;
import static org.junit.Assert.*;

public class UWFNullFieldBugTest {
    @Test
    public void testUselessField() {
        UWFNullFieldBug bug = new UWFNullFieldBug();
        bug.showBug(); // TRIGGER BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        assertNull(bug.getUselessField()); // The field should always be null
    }
}