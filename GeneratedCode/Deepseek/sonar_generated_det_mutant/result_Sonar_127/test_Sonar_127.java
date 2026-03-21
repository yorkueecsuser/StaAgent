import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class CollectionBugTest {

    CollectionBug bug = new CollectionBug();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        List<Integer> result = bug.showBug(); // Line [5]
        assertTrue(result.isEmpty()); // Line [6]
    }

    @Test
    public void testMainMethod() {
        CollectionBug.main(null);
    }
}