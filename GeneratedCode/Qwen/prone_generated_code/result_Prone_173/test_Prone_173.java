import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

class UnusedCollectionModifiedInPlaceExampleTest {

    @Test
    public void testShowBug() {
        UnusedCollectionModifiedInPlaceExample example = new UnusedCollectionModifiedInPlaceExample();
        Collection<String> input = new ArrayList<>();
        input.add("banana");
        input.add("apple");
        input.add("cherry");

        Collection<String> result = example.showBug(input); // TRIGGER BUG: UnusedCollectionModifiedInPlace

        // The test will fail because the returned collection is not sorted
        assertEquals("apple", result.iterator().next());
    }
}