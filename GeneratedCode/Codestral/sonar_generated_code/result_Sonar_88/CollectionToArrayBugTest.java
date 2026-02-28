import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionToArrayBugTest {

    @Test
    public void testGetStringArray() {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
        // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
        // The bug is triggered in the showBug() method of CollectionToArrayBug during the iteration of the result array
    }
}