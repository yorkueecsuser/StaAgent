import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.ArrayList;

public class CollectionBugTest {

    @Test
    public void testBug() {
        List<String> list = new ArrayList<>();
        list.add("foo"); // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
        assertTrue("Bug triggered", list.isEmpty());
    }
}