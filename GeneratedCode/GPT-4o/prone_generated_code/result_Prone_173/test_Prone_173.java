import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class CollectionModifierTest {

    @Test
    public void testShowBug() {
        CollectionModifier cm = new CollectionModifier();
        Collection<String> foos = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        Collection<String> result = cm.showBug(foos); // TRIGGER BUG: UnusedCollectionModifiedInPlace

        // The expected result should be a sorted list, but due to the bug, it will not be.
        Collection<String> expected = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        assertEquals(expected, result); // TRIGGER BUG: UnusedCollectionModifiedInPlace
    }
}