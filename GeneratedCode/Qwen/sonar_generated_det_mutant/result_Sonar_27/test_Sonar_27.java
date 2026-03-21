import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class MapBugExampleTest {

    @Test
    public void testShowBug1() {
        MapBugExample example = new MapBugExample();
        Map<String, String> result = example.showBug1(); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        assertTrue(result.containsKey("key1")); // This assertion will fail because "key1" should not be in the map due to the bug.
    }

    @Test
    public void testShowBug2() {
        MapBugExample example = new MapBugExample();
        Map<String, String> result = example.showBug2(); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        assertEquals("value", result.get("key2")); // This assertion will fail because "key2" should be removed from the map due to the bug.
    }
}