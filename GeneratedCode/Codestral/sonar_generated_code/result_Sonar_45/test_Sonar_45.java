import org.junit.Test;
import static org.junit.Assert.*;

public class RegularExpressionBugTest {
    @Test
    public void testShowBugWithMidLetter() {
        RegularExpressionBug bug = new RegularExpressionBug();
        String input = "b";
        // TRIGGER BUG: "b" is not anchored at all due to the higher precedence of the '|' operator over anchors
        assertFalse(bug.showBug(input));
    }

    @Test
    public void testShowBugWithNonMatchingInput() {
        RegularExpressionBug bug = new RegularExpressionBug();
        String input = "d";
        // TRIGGER BUG: None of the alternatives are matching with the input "d"
        assertFalse(bug.showBug(input));
    }
}