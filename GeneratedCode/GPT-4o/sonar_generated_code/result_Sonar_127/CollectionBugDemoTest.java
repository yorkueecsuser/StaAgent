import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CollectionBugDemoTest {

    @Test
    public void testShowBug1() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        String element = "3";
        // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        Integer result = demo.showBug1(list, element);
        assertNotNull(result); // The test fails because the bug causes result to be null
    }

    @Test
    public void testShowBug2() {
        CollectionBugDemo demo = new CollectionBugDemo();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        String key = "1";
        // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        boolean contains = demo.showBug2(map, key);
        assertTrue(contains); // The test fails because the bug causes contains to be false
    }

    @Test
    public void testShowBug3() {
        CollectionBugDemo demo = new CollectionBugDemo();
        Set<Double> set = new HashSet<>(Arrays.asList(1.0, 2.0, 3.0));
        Integer element = 2;
        // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        boolean removed = demo.showBug3(set, element);
        assertTrue(removed); // The test fails because the bug causes removed to be false
    }
}