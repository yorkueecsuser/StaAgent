import org.junit.Test;
import static org.junit.Assert.*;

public class FloatBugTest {

    private FloatBug bug = new FloatBug();

    @Test
    public void testShowBug() {
        float expected = 16777217.0f;
        // TRIGGER BUG: Math should not be performed on floats
        float actual = bug.showBug();
        assertEquals(expected, actual, 0.0f);
    }
}