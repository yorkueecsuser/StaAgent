import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        List<String> lst = new ArrayList<>();
        lst.add("x1");
        lst.add("y1");
        lst.add("x2");
        try {
            BugExample.showBug(lst); // TRIGGER BUG: Collections should not be modified while they are iterated
        } catch (Exception e) {
            fail("Failed to trigger the bug: " + e.getMessage());
        }
    }
}