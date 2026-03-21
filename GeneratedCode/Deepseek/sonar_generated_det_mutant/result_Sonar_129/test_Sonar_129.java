import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyComparableTest {
    private BuggyComparable buggyComparable = new BuggyComparable();

    @Test
    public void testCompareToBug() {
        try {
            buggyComparable.showBug(); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
            fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
        } catch (Exception e) {
            // Expected exception, test passed
        }
    }
}