import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonExampleTest {

    @Test
    public void testShowBug() {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10); // TRIGGER BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        assertEquals(1, result); // This will pass because of the bug
    }

    @Test
    public void testShowBugWithDifferentInput() {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(20); // TRIGGER BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        assertEquals(1, result); // This should fail logically if the bug wasn't there
    }
}