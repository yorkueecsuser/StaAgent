import org.junit.Test;
import static org.junit.Assert.*;

public class MS_SHOULD_BE_FINALTest {
    @Test
    public void testShowBug() {
        // The bug is here, we are trying to change the value of nonFinalField, which is not final
        MS_SHOULD_BE_FINAL.nonFinalField = "Changed Value"; // TRIGGER BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

        // The test case fails because the nonFinalField value has changed, even though it's not final
        assertEquals("Not final", MS_SHOULD_BE_FINAL.showBug());
    }
}