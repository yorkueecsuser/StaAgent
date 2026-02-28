import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;

public class ImpossibleDowncastBugTest {
    @Test
    public void testShowBug() {
        ImpossibleDowncastBug bug = new ImpossibleDowncastBug();
        String[] result = bug.showBug();
        // TRIGGER BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
        assertEquals("Hello", result[0]); // This line will trigger the bug
        assertEquals("World", result[1]); // This line will also trigger the bug
    }
}