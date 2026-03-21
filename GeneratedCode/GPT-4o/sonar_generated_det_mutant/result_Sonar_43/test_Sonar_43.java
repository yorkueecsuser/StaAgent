import org.junit.Test;
import static org.junit.Assert.*;

public class RegexSyntaxIssueTest {

    @Test
    public void testShowBug() {
        RegexSyntaxIssue regexIssue = new RegexSyntaxIssue();
        
        try {
            regexIssue.showBug(); // TRIGGER BUG: Regular expressions should be syntactically valid
            fail("Expected an exception due to invalid regex syntax"); // This line should not be reached
        } catch (Exception e) {
            // Exception is expected due to the invalid regex in showBug method
        }
    }
}