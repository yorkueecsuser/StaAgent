import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class MapValueOverwriteTest {

    @Test
    public void testShowBug() {
        MapValueOverwrite example = new MapValueOverwrite();
        Map<String, String> result = example.showBug();
        
        // TRIGGER BUG: Map values should not be replaced unconditionally
        // Expecting "Apple", but "Boy" is set because of the bug
        assertEquals("Apple", result.get("a"));  // This should fail
    }

    @Test
    public void testShowBugWithArray() {
        MapValueOverwrite example = new MapValueOverwrite();
        String[] towns = new String[2];
        example.showBugWithArray(towns, 1);
        
        // TRIGGER BUG: Map values should not be replaced unconditionally
        // Expecting "London", but "Chicago" is set because of the bug
        assertEquals("London", towns[1]);  // This should fail
    }
}