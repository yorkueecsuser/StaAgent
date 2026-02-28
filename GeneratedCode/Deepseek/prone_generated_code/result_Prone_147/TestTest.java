import org.junit.Test;
import static org.junit.Assert.*;

public class TestTest {
    @Test(expected = AssertionError.class)
    public void testMain() {
        Test.main(null);
        // TRIGGER BUG: ReturnValueIgnored
    }
}