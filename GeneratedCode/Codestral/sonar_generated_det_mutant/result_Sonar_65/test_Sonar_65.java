import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionSizeBugTest {

    @Test
    public void testShowBug() {
        CollectionSizeBug bug = new CollectionSizeBug();
        List<Integer> myList = new ArrayList<>();
        myList.add(-1); // Adding negative number to make size >= 0 check fail
        int[] myArray = {}; // Empty array to make length >= 0 check fail

        boolean result = bug.showBug(myList, myArray);

        // TRIGGER BUG: Collection sizes and array length comparisons should make sense
        assertFalse(result);
    }
}