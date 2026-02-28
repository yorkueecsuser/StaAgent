import org.junit.Test;
import static org.junit.Assert.*;

public class NonCompliantCodeTest {
    NonCompliantCode nonCompliantCode = new NonCompliantCode();

    @Test
    public void testShowBug() {
        try {
            nonCompliantCode.showBug(1);
        } catch (Exception e) {
            // TRIGGER BUG: Related "if/else if" statements should not have the same condition
            fail("Expected an Exception to be thrown");
        }
    }
}