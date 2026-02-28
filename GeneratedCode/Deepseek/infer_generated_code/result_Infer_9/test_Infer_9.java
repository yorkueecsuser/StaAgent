import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class InefficientKeysetIteratorBugTest {
    private InefficientKeysetIteratorBug buggy = new InefficientKeysetIteratorBug();

    // TRIGGER BUG: INEFFICIENT_KEYSET_ITERATOR
    @Test
    public void testBuggyMethod() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("one", 1);
        testMap.put("two", 2);
        testMap.put("three", 3);
        assertEquals(6, buggy.showBug(testMap)); // This test should fail
    }

    // TRIGGER BUG: INEFFICIENT_KEYSET_ITERATOR
    @Test
    public void testBuggyMethod1() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("four", 4);
        testMap.put("five", 5);
        testMap.put("six", 6);
        assertEquals(15, buggy.showBug1(testMap)); // This test should fail
    }

    // TRIGGER BUG: INEFFICIENT_KEYSET_ITERATOR
    @Test
    public void testBuggyMethod2() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("seven", 7);
        testMap.put("eight", 8);
        testMap.put("nine", 9);
        assertEquals(24, buggy.showBug2(testMap)); // This test should fail
    }
}