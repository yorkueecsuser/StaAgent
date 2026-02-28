import org.junit.Test;
import static org.junit.Assert.*;

public class MapBugExampleTest {

    @Test
    public void testShowBug1() {
        MapBugExample example = new MapBugExample();
        assertNull(example.showBug1("key1")); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
    }

    @Test
    public void testShowBug2() {
        MapBugExample example = new MapBugExample();
        assertNull(example.showBug2("key2")); // TRIGGER BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
    }
}