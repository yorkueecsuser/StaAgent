import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOctalValueBugTest {
    private IntegerOctalValueBug bug = new IntegerOctalValueBug();

    @Test // TRIGGER BUG: AvoidUsingOctalValues
    public void testShowBug() {
        int expected = 120; // the expected result, which is not correct due to Octal number usage
        int actual = bug.showBug(); // Trigger the bug
        assertEquals(expected, actual); // assertion to verify if the bug is triggered
    }
}