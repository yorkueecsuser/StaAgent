import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {

    @Test
    public void testShowBugWithSensitiveData() {
        TypeQualifierBug bugInstance = new TypeQualifierBug();
        String result = bugInstance.showBug("SensitiveInformation"); // TRIGGER BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        assertEquals("sensitiveinformation", result); // This assertion will pass, but it demonstrates the bug by showing the sensitive data is transformed in a way that does not respect its sensitivity.
        assertFalse(result.equals("SensitiveInformation")); // This assertion will fail, triggering the test to fail and demonstrating the bug.
    }
}