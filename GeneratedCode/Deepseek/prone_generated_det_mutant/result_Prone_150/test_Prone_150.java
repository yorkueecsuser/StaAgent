import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonTest {
    @Test
    public void testShowBug() {
        SelfComparison sc = new SelfComparison();
        int[] array = {1, 2, 3, 4, 5};
        int index = sc.showBug(array);  // TRIGGER BUG: SelfComparison
        assertEquals(0, index);  // This assertion should fail as the bug should trigger
    }
}