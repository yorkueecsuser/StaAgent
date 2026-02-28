import org.junit.Test;
import static org.junit.Assert.*;

public class JavaAllocNegativeSizeExampleTest {
    JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        example.showBug();
    }
}