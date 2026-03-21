import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class CollectionToArrayBugDemoTest {

    @Test
    public void testShowBug() {
        CollectionToArrayBugDemo demo = new CollectionToArrayBugDemo();
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        // The following line is expected to trigger a ClassCastException because the showBug method
        // contains a bug where toArray() is used incorrectly.
        String[] result = demo.showBug(strings); // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type

        // If the bug is present, the following assert will not be reached.
        assertNotNull("The result should not be null", result);
    }
}