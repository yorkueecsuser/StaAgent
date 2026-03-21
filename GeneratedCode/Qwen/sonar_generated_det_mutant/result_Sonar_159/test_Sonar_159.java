import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class IteratorBugExampleTest {

    @Test
    public void testShowBugWithEmptyList() {
        IteratorBugExample example = new IteratorBugExample();
        List<String> emptyList = new ArrayList<>();
        List<String> result = example.showBug(emptyList); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        assertEquals("Result should be an empty list", new ArrayList<>(), result);
    }

    @Test
    public void testShowBugWithSingleElementList() {
        IteratorBugExample example = new IteratorBugExample();
        List<String> singleElementList = List.of("A");
        List<String> result = example.showBug(singleElementList); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        assertEquals("Result should contain one element", List.of("A"), result);
    }

    @Test
    public void testShowBugWithMultipleElementsList() {
        IteratorBugExample example = new IteratorBugExample();
        List<String> multipleElementsList = List.of("A", "B", "C");
        List<String> result = example.showBug(multipleElementsList); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        assertEquals("Result should contain all elements", List.of("A", "B", "C"), result);
    }
}