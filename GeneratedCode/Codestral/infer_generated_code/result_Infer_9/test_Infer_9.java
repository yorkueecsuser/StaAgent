import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class InefficientKeysetIteratorTest {
    @Test
    public void testInefficientLoopBad() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("one", 1);
        testMap.put("two", 2);
        testMap.put("three", 3);

        InefficientKeysetIterator iterator = new InefficientKeysetIterator();
        iterator.showBug(testMap);
        // TRIGGER BUG: INEFFICIENT_KEYSET_ITERATOR
    }
}