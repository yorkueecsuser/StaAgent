import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionToArrayBugTest {
    @Test
    public void testBug() {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        String[] array = bug.showBug();
        
        // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
        assertEquals(String[].class, array.getClass());
    }
}