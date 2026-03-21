import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBackReferenceBugTest {

    @Test
    public void testPattern1() {
        RegexBackReferenceBug instance = new RegexBackReferenceBug();
        instance.showBug(); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        fail("Expected PatternSyntaxException"); // Fail the test to indicate the bug should be triggered
    }

    @Test
    public void testPattern2() {
        RegexBackReferenceBug instance = new RegexBackReferenceBug();
        instance.showBug(); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        fail("Expected PatternSyntaxException"); // Fail the test to indicate the bug should be triggered
    }

    @Test
    public void testPattern3() {
        RegexBackReferenceBug instance = new RegexBackReferenceBug();
        instance.showBug(); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        fail("Expected to not match due to back reference issue"); // Fail the test to indicate the bug should be triggered
    }

    @Test
    public void testPattern4() {
        RegexBackReferenceBug instance = new RegexBackReferenceBug();
        instance.showBug(); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        fail("Expected PatternSyntaxException"); // Fail the test to indicate the bug should be triggered
    }
}