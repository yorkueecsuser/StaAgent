import org.junit.Test;
import static org.junit.Assert.*;

public class JavaAllocNegativeSizeExampleTest {

    @Test
    public void testShowBug() {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        int[] result = example.showBug(); // TRIGGER BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
        assertNotNull(result); // This line is expected to fail due to the bug
    }
}