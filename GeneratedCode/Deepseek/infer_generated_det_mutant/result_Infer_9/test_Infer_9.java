import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class InefficientKeysetIteratorBugTest {

    @Test
    public void testEfficientLoopOk() {
        InefficientKeysetIteratorBug bug = new InefficientKeysetIteratorBug();
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("One", 1);
        testMap.put("Two", 2);
        testMap.put("Three", 3);
        bug.efficient_loop_ok(testMap);
        // TRIGGER BUG: INEFFICIENT_KEYSET_ITERATOR
        assertEquals(3, testMap.size());
    }
}