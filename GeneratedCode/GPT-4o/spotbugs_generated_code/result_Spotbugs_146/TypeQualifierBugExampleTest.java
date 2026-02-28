import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class TypeQualifierBugExampleTest {

    @Test
    public void testShowBug() {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Test String"); // TRIGGER BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        assertEquals(1, result.size()); // This assertion will pass because the bug doesn't affect the size of the list
        assertNull(result.get(0)); // This assertion will fail to demonstrate the bug
    }
}