import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {

    @Test
    public void testShowBug() {
        SelfComparisonBug bug = new SelfComparisonBug();
        int result = bug.showBug(5); // TRIGGER BUG: SelfComparison
        assertEquals(1, result); // This will cause the test to fail
    }
}