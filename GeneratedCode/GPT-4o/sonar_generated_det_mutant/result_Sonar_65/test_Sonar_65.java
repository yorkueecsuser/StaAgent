import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionAndArraySizeBugTest {

    @Test
    public void testShowBug() {
        CollectionAndArraySizeBug bugDemo = new CollectionAndArraySizeBug();
        List<String> list = new ArrayList<>();
        int[] array = new int[10];

        // This will trigger the bug since the methods contain redundant checks
        // These checks are always true or false and hence should not affect program logic
        boolean result = bugDemo.showBug(list, array); // TRIGGER BUG: Collection sizes and array length comparisons should make sense

        // We can expect the result to always be true since array length is always >= 0
        assertFalse("This test is expected to fail due to a bug in the code.", result); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }
}