import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class BugExampleTest {

    BugExample bugExample = new BugExample();

    @Test
    public void testGetStringArray() {
        List<String> strings = List.of("Hello", "World");
        assertThrows(ClassCastException.class, () -> bugExample.getStringArray(strings));  // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
    }
}