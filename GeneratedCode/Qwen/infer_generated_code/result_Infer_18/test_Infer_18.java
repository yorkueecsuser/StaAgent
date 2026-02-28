import org.junit.Test;
import static org.junit.Assert.*;

public class AllocNegativeSizeExampleTest {

    @Test
    public void testShowBugTriggersNegativeAllocation() {
        AllocNegativeSizeExample example = new AllocNegativeSizeExample();
        example.showBug(); // TRIGGER BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
    }
}