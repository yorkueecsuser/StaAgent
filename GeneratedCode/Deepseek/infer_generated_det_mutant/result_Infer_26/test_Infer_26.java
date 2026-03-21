import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class BugExampleTest {
    
    // This method is used to perform assertion. It is not part of the original buggy code.
    private void assertArrayEqual(int[] expected, int[] actual) {
        assertArrayEquals(expected, actual);
    }

    @Test
    // TRIGGER BUG: IMPURE_FUNCTION​
    public void testMakeAllZero_impure() {
        BugExample bugExample = new BugExample();
        int[] result = bugExample.showBug();
        // The bug here is that the impure function makeAllZero_impure changes the state of the objects of the list passed to it
        // and does not return any values. 
        // The test case should fail because it expects an empty array as output.
        assertArrayEqual(new int[]{0, 0}, result);  
    }
}