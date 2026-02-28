import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectComparisonExampleTest {

    @Test
    public void testShowBugWithStrings() {
        ObjectComparisonExample example = new ObjectComparisonExample();
        assertFalse(example.showBug("hello", "hello", 128, 128)); // TRIGGER BUG: CompareObjectsWithEquals
    }

    @Test
    public void testShowBugWithIntegers() {
        ObjectComparisonExample example = new ObjectComparisonExample();
        assertFalse(example.showBug("world", "earth", new Integer(1000), new Integer(1000))); // TRIGGER BUG: CompareObjectsWithEquals
    }
}