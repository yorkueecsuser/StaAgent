import org.junit.Test;
import static org.junit.Assert.*;

public class MS_SHOULD_BE_REFACTORED_TO_BE_FINALTest {
    @Test
    public void testBug() {
        MS_SHOULD_BE_REFACTORED_TO_BE_FINAL.showBug(); // TRIGGER BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
        fail("Exception expected");
    }
}