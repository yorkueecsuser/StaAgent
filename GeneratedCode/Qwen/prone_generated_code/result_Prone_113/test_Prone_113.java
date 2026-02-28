import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionBugDemoTest {

    @Test
    public void testShowBug1() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> result = demo.showBug1(new ArrayList<>(list)); // TRIGGER BUG: ModifyingCollectionWithItself
        assertEquals(6, result.size()); // This will fail because list.addAll(list) duplicates elements
    }

    @Test
    public void testShowBug2() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> result = demo.showBug2(new ArrayList<>(list)); // TRIGGER BUG: ModifyingCollectionWithItself
        assertEquals(3, result.size()); // This will fail because list.retainAll(list) is a no-op
    }

    @Test
    public void testShowBug3() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> result = demo.showBug3(new ArrayList<>(list)); // TRIGGER BUG: ModifyingCollectionWithItself
        assertEquals(0, result.size()); // This will fail because list.removeAll(list) clears the list
    }

    @Test
    public void testShowBug4() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        boolean result = demo.showBug4(new ArrayList<>(list)); // TRIGGER BUG: ModifyingCollectionWithItself
        assertFalse(result); // This will fail because list.containsAll(list) is always true
    }
}