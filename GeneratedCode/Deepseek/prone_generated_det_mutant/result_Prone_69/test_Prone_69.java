import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class BuggyImmutableTest {
    @Test
    public void testBugTrigger() {
        List<String> list = new ArrayList<>();
        list.add("test");
        BuggyImmutable buggy = new BuggyImmutable(new ArrayList<>(list)); // TRIGGER BUG: Immutable

        list.add("test2");

        assertEquals(1, buggy.getField1().size());
    }
}