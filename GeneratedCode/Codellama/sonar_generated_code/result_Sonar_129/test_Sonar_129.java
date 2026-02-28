import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyComparisonTest {
    @Test
    public void testCompareTo() {
        List<String> list = Arrays.asList("a", "b", "c");
        int result = list.get(0).compareTo(list.get(1)); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
        assertTrue(result!= Integer.MIN_VALUE);
    }
}