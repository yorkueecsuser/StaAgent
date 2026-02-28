import org.junit.Test;
import static org.junit.Assert.*;

public class MapValueReplacementBugTest {

    @Test
    public void testShowBug() {
        MapValueReplacementBug bugDemo = new MapValueReplacementBug();
        assertEquals("Apple", bugDemo.showBug());  // TRIGGER BUG: Map values should not be replaced unconditionally
    }

    @Test
    public void testShowBug2() {
        MapValueReplacementBug bugDemo = new MapValueReplacementBug();
        String[] towns = new String[5];
        assertEquals("London", bugDemo.showBug2(towns, 0));  // TRIGGER BUG: Map values should not be replaced unconditionally
    }
}