import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionModificationBugTest {

    @Test(expected = java.util.ConcurrentModificationException.class)
    public void testShowBugWithModificationDuringIteration() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("xbanana");
        list.add("cherry");
        list.add("xdurian");

        CollectionModificationBug.showBug(list); // TRIGGER BUG: Collections should not be modified while they are iterated
    }
}