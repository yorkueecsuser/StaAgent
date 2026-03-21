import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Object obj = BuggyCode.showBug(list); // TRIGGER BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        assertTrue(obj instanceof String);
    }
}