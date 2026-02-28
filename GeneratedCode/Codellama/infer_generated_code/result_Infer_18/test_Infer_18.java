import org.junit.Test;
import static org.junit.Assert.*;

public class JavaAllocNegativeSizeExampleTest {
    @Test
    public void testBugTrigger() {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        int[] tempArray = new int[Math.abs(50)]; // TRIGGER BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
        assertNotNull(tempArray);
        assertEquals(50, tempArray.length);
    }
}