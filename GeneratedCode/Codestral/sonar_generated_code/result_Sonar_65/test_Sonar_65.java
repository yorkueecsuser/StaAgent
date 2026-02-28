import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];

        assertFalse("List size is always non-negative", bc.showBug(myList, myArray)); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }
}