import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

public class MapComputeBugDemoTest {

    @Test
    public void testShowBugWithComputeIfAbsent() {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        Map<String, String> result = demo.showBug("exampleKey");
        
        // The map should not contain "exampleKey" with a null value
        assertTrue(result.containsKey("exampleKey")); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
    }

    @Test
    public void testShowBugWithComputeIfPresent() {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        // Pre-populating the map with a key to test computeIfPresent
        Map<String, String> initialMap = new HashMap<>();
        initialMap.put("exampleKey", "value");
        
        Map<String, String> result = demo.showBug("exampleKey");

        // The map should not have removed "exampleKey" when computeIfPresent returns null
        assertTrue(result.containsKey("exampleKey")); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
    }
}