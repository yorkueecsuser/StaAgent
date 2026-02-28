import org.junit.Test;
import static org.junit.Assert.*;

public class JavaAllocNegativeSizeExampleTest {
    @Test
    public void testShowBug() {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        example.showBug(); // TRIGGER BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
    }
}