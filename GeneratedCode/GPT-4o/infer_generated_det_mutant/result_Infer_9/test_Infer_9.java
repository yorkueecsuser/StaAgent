import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class InefficientKeySetIteratorExampleTest {

    @Test
    public void testShowBug() {
        InefficientKeySetIteratorExample example = new InefficientKeySetIteratorExample();
        
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("one", 1);
        testMap.put("two", 2);
        testMap.put("three", 3);

        example.showBug(testMap); // TRIGGER BUG: INEFFICIENT_KEYSET_ITERATOR
    }
}