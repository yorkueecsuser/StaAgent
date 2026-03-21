import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ConcurrentModificationException;

class CollectionModificationDuringIterationTest {

    @Test(expected = ConcurrentModificationException.class)
    public void testShowBug() {
        List<String> exampleList = new ArrayList<>();
        exampleList.add("apple");
        exampleList.add("xbanana");
        exampleList.add("cherry");
        exampleList.add("xdurian");

        // TRIGGER BUG: Collections should not be modified while they are iterated
        CollectionModificationDuringIteration.showBug(exampleList);

        // The test will fail because the showBug method modifies the list during iteration, causing a ConcurrentModificationException
        assertEquals(4, exampleList.size());
    }
}