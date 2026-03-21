import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionSizeBugTest {

    @Test
    public void testShowBug1() {
        CollectionSizeBug bugDemo = new CollectionSizeBug();
        List<Integer> myList = new ArrayList<>();
        assertFalse(bugDemo.showBug1(myList)); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }

    @Test
    public void testShowBug2() {
        CollectionSizeBug bugDemo = new CollectionSizeBug();
        int[] myArray = new int[5];
        assertFalse(bugDemo.showBug2(myArray)); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }

    @Test
    public void testShowBug3() {
        CollectionSizeBug bugDemo = new CollectionSizeBug();
        List<Integer> myList = new ArrayList<>();
        assertTrue(bugDemo.showBug3(myList)); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }
}