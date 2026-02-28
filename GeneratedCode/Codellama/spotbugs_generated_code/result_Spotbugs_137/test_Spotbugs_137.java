import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BugExampleTest {
    @Test
    public void testContains() {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        assertFalse(list.contains(new Object())); // TRIGGER BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    }
}