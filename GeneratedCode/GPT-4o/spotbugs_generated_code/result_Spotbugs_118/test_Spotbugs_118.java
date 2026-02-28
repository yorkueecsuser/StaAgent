import org.junit.Test;
import static org.junit.Assert.*;

public class NullInstanceOfExampleTest {

    @Test
    public void testShowBugWithNull() {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null); // TRIGGER BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        assertTrue("The bug was not triggered correctly, expected true but got false.", result);
    }
}