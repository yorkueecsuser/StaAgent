import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {
    @Test
    public void testShowBug() {
        SelfComparisonBug bug = new SelfComparisonBug();
        bug.setValue(10);
        // TRIGGER BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        assertFalse(bug.showBug());
    }
}