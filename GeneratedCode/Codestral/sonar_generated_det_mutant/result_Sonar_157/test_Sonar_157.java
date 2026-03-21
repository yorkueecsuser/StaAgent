import org.junit.Test;
import static org.junit.Assert.*;

public class RelatedIfElseBugTest {

    @Test
    public void testBugTrigger() {
        RelatedIfElseBug bug = new RelatedIfElseBug();
        bug.showBug(1);  // TRIGGER BUG: Related "if/else if" statements should not have the same condition
        // The test will fail since the method will print "Opening window" but will not execute the dead code
        // This is due to the same condition (param == 1) being checked on lines 5 and 7 in the showBug method
    }
}