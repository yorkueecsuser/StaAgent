import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        String str = null;
        // TRIGGER BUG: Null pointers should not be dereferenced
        str.length(); // This line triggers the bug
    }
}