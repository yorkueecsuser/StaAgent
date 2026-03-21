import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionBugDemoTest {

    @Test
    public void testShowBug() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        boolean result = demo.showBug(integers, "test"); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        assertTrue("Expected false because 'test' is a String and not present in List of Integers", result);
    }

    @Test
    public void testShowBug2() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);

        int result = demo.showBug2(doubles, 'a'); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        assertNotEquals("Expected -1 because 'a' is a Character and not present in List of Doubles", -1, result);
    }
}