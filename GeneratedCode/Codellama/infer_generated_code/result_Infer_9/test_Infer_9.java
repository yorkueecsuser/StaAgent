import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

class InefficientKeysetIteratorTest {
    @Test
    public void testInefficientKeysetIterator() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 1);
        testMap.put("b", 2);
        testMap.put("c", 3);

        // BUG: INEFFICIENT_KEYSET_ITERATOR
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key);
            System.out.println(key + " " + value);
        }
    }
}