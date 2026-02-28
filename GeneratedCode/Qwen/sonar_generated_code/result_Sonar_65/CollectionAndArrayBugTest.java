import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionAndArrayBugTest {

    @Test
    public void testShowBug1() {
        CollectionAndArrayBug bugDemo = new CollectionAndArrayBug();
        List<Integer> myList = new ArrayList<>();
        assertTrue(bugDemo.showBug1(myList)); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }

    @Test
    public void testShowBug2() {
        CollectionAndArrayBug bugDemo = new CollectionAndArrayBug();
        int[] myArray = new int[5];
        assertTrue(bugDemo.showBug2(myArray)); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }

    @Test
    public void testShowBug3() {
        CollectionAndArrayBug bugDemo = new CollectionAndArrayBug();
        List<Integer> myList = new ArrayList<>();
        assertFalse(bugDemo.showBug3(myList)); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }
}