import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {

    @Test
    public void testShowBug() {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        assertFalse(bugDemo.showBug()); // TRIGGER BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}