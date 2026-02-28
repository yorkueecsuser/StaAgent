import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();
        Map<String, String> result = main.showBug();
        assertNull("Null value was inserted", result.get("key")); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
    }
}