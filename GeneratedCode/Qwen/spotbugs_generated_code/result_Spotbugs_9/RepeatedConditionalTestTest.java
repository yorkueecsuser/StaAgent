import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedConditionalTestTest {

    @Test
    public void testShowBug() {
        RepeatedConditionalTest test = new RepeatedConditionalTest();
        assertFalse(test.showBug(1, 0)); // TRIGGER BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)  
    }

    @Test
    public void testShowBug1() {
        RepeatedConditionalTest test = new RepeatedConditionalTest();
        assertFalse(test.showBug1(1, 0)); // TRIGGER BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)  
    }

    @Test
    public void testShowBug2() {
        RepeatedConditionalTest test = new RepeatedConditionalTest();
        assertFalse(test.showBug2(1, 1)); // TRIGGER BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)  
    }
}