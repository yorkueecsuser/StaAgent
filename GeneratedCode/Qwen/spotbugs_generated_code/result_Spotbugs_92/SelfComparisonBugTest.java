import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {

    @Test
    public void testShowBug() {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        assertFalse(bugDemo.showBug(5)); // TRIGGER BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
    }
}