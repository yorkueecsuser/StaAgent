import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Test class for BuggyIterable
public class BuggyIterableTest {

    @Test
    public void testIterableBug() {
        int[] elements = {1, 2, 3, 4, 5};
        BuggyIterable buggyIterable = new BuggyIterable(elements);
        buggyIterable.showBug(); // TRIGGER BUG: "iterator" should not return "this"
        // The second iteration will not work correctly
        // because the iterator state is shared
        assertEquals(1, (int) buggyIterable.next()); // This line will cause the test to fail
    }
}