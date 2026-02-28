import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class IteratorBugExampleTest {

    @Test
    public void testShowBugWithEmptyList() {
        IteratorBugExample example = new IteratorBugExample();
        List<String> items = List.of();
        List<String> result = example.showBug(items);
        assertEquals("Expected empty list", items, result); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    }

    @Test
    public void testShowBugWithSingleItemList() {
        IteratorBugExample example = new IteratorBugExample();
        List<String> items = List.of("A");
        List<String> result = example.showBug(items);
        assertEquals("Expected single item list", items, result); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    }

    @Test
    public void testShowBugWithMultipleItemsList() {
        IteratorBugExample example = new IteratorBugExample();
        List<String> items = List.of("A", "B", "C");
        List<String> result = example.showBug(items);
        assertEquals("Expected multiple items list", items, result); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    }
}