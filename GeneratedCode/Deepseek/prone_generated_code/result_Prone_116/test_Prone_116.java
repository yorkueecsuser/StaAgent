import org.junit.Test;
import java.util.List;
import java.util.Collections;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        List<Character> list = Collections.nCopies(10, 'a'); // TRIGGER BUG: NCopiesOfChar
        assertEquals(10, list.size()); // This line should fail
    }
}