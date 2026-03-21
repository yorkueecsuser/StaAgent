import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedConditionalTestTest {
    RepeatedConditionalTest rct = new RepeatedConditionalTest();

    @Test
    public void testShowBug() {
        String result = rct.showBug(0); // TRIGGER BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        assertEquals("x is zero or x is zero", result); // This should fail
    }
}