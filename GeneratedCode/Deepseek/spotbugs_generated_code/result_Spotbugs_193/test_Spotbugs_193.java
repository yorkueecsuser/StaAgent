import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugTest {

    @Test
    public void testModifyField() throws Exception {
        // TRIGGER BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD)
        assertEquals("not so secret anymore", ReflectionBug.showBug());
    }
}