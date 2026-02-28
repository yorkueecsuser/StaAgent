import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {

    @Test
    public void testShowBug() {
        SelfComparisonBug buggyClass = new SelfComparisonBug();
        int value = 10;
        // TRIGGER BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        assertFalse(buggyClass.showBug(value));
    }
}