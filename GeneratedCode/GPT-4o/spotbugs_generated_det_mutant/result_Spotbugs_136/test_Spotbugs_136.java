import org.junit.Test;
import static org.junit.Assert.*;

public class QuestionableBooleanAssignmentTest {

    @Test
    public void testShowBugWithPositiveValue() {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        boolean result = example.showBug(5);
        assertFalse(result); // TRIGGER BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
    }
    
    @Test
    public void testShowBugWithZeroValue() {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        boolean result = example.showBug(0);
        assertFalse(result); // TRIGGER BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
    }
    
    @Test
    public void testShowBugWithNegativeValue() {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        boolean result = example.showBug(-1);
        assertFalse(result); // TRIGGER BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
    }
}