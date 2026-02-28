import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidAssertExampleTest {

    @Test
    public void testShowBug() {
        AvoidAssertExample example = new AvoidAssertExample();
        String result = example.showBug(); // TRIGGER BUG: AvoidAssertAsIdentifier
        assertEquals("foo", result); // TRIGGER BUG: AvoidAssertAsIdentifier
    }
}