import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class CollectionToArrayBugTest {
    @Test
    public void testShowBug() {
        List<String> strings = Arrays.asList("Hello", "World");
        CollectionToArrayBug bug = new CollectionToArrayBug();
        String result = bug.showBug(strings); // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
        assertEquals("Caught ClassCastException: java.lang.ClassCastException: [Ljava.lang.String; cannot be cast to [Ljava.lang.String;", result);
    }
}