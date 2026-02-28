import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssertionExampleTest {

    @Test
    public void testSelfAssertionBug() {
        SelfAssertionExample example = new SelfAssertionExample();
        boolean result = example.showBug(); // TRIGGER BUG: SelfAssertion
        assertFalse("The self assertion bug should trigger a false result", result);
    }
}