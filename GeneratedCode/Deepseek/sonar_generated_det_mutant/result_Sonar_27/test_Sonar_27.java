import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class BugCodeTest {

    @Test
    public void testShowBug() {
        BugCode bugCode = new BugCode();
        Map<String, String> map = bugCode.showBug();
        assertFalse(map.containsValue(null)); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
    }
}