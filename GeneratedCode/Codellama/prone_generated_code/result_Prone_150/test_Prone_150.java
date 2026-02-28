import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {
    @Test
    public void testSelfComparisonBug() {
        String str = "Hello, World!";
        assertEquals(1, str.compareTo(str)); // TRIGGER BUG: SelfComparison
    }
}