import org.junit.Test;
import static org.junit.Assert.*;

public class NP_NullInstanceOfBugTest {
    NP_NullInstanceOfBug bug = new NP_NullInstanceOfBug();

    @Test
    public void triggerBug() {
        String result = (String) bug.showBug();
        assertEquals("obj is not an instance of String", result); // TRIGGER BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }
}