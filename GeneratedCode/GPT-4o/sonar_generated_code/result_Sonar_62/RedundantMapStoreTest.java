import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class RedundantMapStoreTest {

    @Test
    public void testShowBug() {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        assertEquals("Apple", resultMap.get("a")); // TRIGGER BUG: Map values should not be replaced unconditionally
    }

    @Test
    public void testShowBugWithArray() {
        RedundantMapStore example = new RedundantMapStore();
        String[] resultArray = example.showBugWithArray(1);
        assertEquals("London", resultArray[1]); // TRIGGER BUG: Map values should not be replaced unconditionally
    }
}