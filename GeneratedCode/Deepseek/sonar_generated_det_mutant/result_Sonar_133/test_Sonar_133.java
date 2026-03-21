import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    public void testShowBug() {
        int a = 10;
        float b = 0.5f;
        float result = (a < 5)? a : b; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }
}