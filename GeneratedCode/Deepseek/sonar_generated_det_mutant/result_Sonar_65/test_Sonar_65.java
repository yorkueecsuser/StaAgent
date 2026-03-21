import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[0];
        boolean result = buggyCode.showBug(myList, myArray);
        assertFalse(result); // TRIGGER BUG: Collection sizes and array length comparisons should make sense
    }
}