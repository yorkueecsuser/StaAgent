import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionToArrayBugTest {

    @Test
    public void testShowBugWithEmptyList() {
        CollectionToArrayBug bugDemo = new CollectionToArrayBug();
        List<String> stringList = new ArrayList<>();
        String[] result = bugDemo.showBug(stringList); // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
        assertEquals(0, result.length);
    }

    @Test
    public void testShowBugWithSingleElement() {
        CollectionToArrayBug bugDemo = new CollectionToArrayBug();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        String[] result = bugDemo.showBug(stringList); // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
        assertEquals(1, result.length);
        assertEquals("Hello", result[0]);
    }

    @Test
    public void testShowBugWithMultipleElements() {
        CollectionToArrayBug bugDemo = new CollectionToArrayBug();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        String[] result = bugDemo.showBug(stringList); // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
        assertEquals(2, result.length);
        assertEquals("Hello", result[0]);
        assertEquals("World", result[1]);
    }
}