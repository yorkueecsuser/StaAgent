import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnusedCollectionModifiedInPlaceBugTest {

    @Test
    public void testSort() {
        UnusedCollectionModifiedInPlaceBug bug = new UnusedCollectionModifiedInPlaceBug();
        List<String> input = Arrays.asList("cherry", "banana", "apple");
        List<String> expected = new ArrayList<>(input);
        Collections.sort(expected); // Expected sorted list
        Collection<String> result = bug.sort(input); // TRIGGER BUG: UnusedCollectionModifiedInPlace
        assertEquals(expected, result);
    }
}