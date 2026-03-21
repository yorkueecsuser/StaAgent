import org.junit.Test;
import static org.junit.Assert.*;

public class RegularExpressionBugTest {

    @Test
    public void testShowBug() {
        RegularExpressionBug bug = new RegularExpressionBug();
        String input = "a".repeat(20000); // Large input to trigger the stack overflow
        bug.showBug(input); // TRIGGER BUG: Regular expressions should not overflow the stack
    }
}