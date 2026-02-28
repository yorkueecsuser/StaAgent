import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class GenericCollectionBugTest {

    @Test
    public void testShowBugWithBarObject() {
        GenericCollectionBug example = new GenericCollectionBug();
        List<String> list = new ArrayList<>();
        list.add("example");

        GenericCollectionBug.Bar bar = new GenericCollectionBug.Bar(1);
        boolean result = example.showBug(list, bar); // TRIGGER BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        assertFalse("Expected the list not to contain the Bar object, but it did.", result);
    }
}