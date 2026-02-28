import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientKeysetIteratorExampleTest {

    @Test
    public void testInefficientLoopBad() {
        InefficientKeysetIteratorExample example = new InefficientKeysetIteratorExample();
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("one", 1);
        testMap.put("two", 2);
        testMap.put("three", 3);
        example.showBug(testMap); // TRIGGER BUG: INEFFICIENT_KEYSET_ITERATOR
        fail("This test should fail due to inefficient keyset iteration."); // This will make the test fail intentionally
    }
}