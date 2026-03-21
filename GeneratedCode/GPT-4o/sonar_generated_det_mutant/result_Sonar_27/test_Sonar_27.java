import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

public class MapComputeBugExampleTest {

    @Test
    public void testShowBugWithComputeIfAbsent() {
        MapComputeBugExample example = new MapComputeBugExample();
        Map<String, String> result = example.showBug("absentKey");
        
        // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        assertTrue("The map should contain the key with a null value", result.containsKey("absentKey"));
        assertNull("The value should be null for the key", result.get("absentKey"));
    }
    
    @Test
    public void testShowBugWithComputeIfPresent() {
        MapComputeBugExample example = new MapComputeBugExample();
        Map<String, String> result = example.showBug("presentKey");
        
        // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        assertFalse("The map should not contain the key", result.containsKey("presentKey"));
    }
}

class MapComputeBugExample {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // Demonstrating the bug with computeIfAbsent
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Demonstrating the bug with computeIfPresent
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        return map;
    }
    
    public static void main(String[] args) {
        MapComputeBugExample example = new MapComputeBugExample();
        Map<String, String> result = example.showBug("testKey");
        System.out.println("Map contents: " + result);
    }
}