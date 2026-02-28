import org.junit.Test;
import static org.junit.Assert.*;

public class TypeParameterBugDemoTest {

    @Test
    public void testShowBug() {
        // This test aims to trigger the bug by calling the showBug method
        String result = TypeParameterBugDemo.showBug(); // TRIGGER BUG: TypeParameterQualifier
        assertEquals("This is a message", result); // Expected value to test against
    }
}