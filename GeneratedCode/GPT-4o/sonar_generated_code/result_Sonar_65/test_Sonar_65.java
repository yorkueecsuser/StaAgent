import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionSizeBugExampleTest {

    @Test
    public void testShowBugWithNonEmptyListAndArray() {
        CollectionSizeBugExample example = new CollectionSizeBugExample();
        List<String> myList = new ArrayList<>();
        myList.add("Test");
        int[] myArray = {1, 2, 3};

        boolean result = example.showBug(myList, myArray); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
        assertFalse("The method should return false because the check is erroneous.", result);
    }

    @Test
    public void testShowBugWithEmptyList() {
        CollectionSizeBugExample example = new CollectionSizeBugExample();
        List<String> myList = new ArrayList<>();
        int[] myArray = {1, 2, 3};

        boolean result = example.showBug(myList, myArray); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
        assertFalse("The method should return false because the check is erroneous.", result);
    }

    @Test
    public void testShowBugWithEmptyArray() {
        CollectionSizeBugExample example = new CollectionSizeBugExample();
        List<String> myList = new ArrayList<>();
        int[] myArray = {};

        boolean result = example.showBug(myList, myArray); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
        assertFalse("The method should return false because the check is erroneous.", result);
    }
}