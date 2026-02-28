import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {
    @Test
    public void testSelfComparison() {
        int x = 5;
        if (x == x) {
            // TRIGGER BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            fail("Self comparison should not be equal");
        } else {
            // This branch should not be executed
            fail("Self comparison should be equal");
        }
    }
}