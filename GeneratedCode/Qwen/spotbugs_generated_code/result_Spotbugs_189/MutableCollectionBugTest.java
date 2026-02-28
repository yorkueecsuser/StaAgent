import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;

public class MutableCollectionBugTest {

    @Test
    public void testMutableSetModification() {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        Set<String> initialSet = bugDemo.showBug(); // TRIGGER BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)  
        assertEquals(2, initialSet.size());

        // Modifying the set from outside the class
        MutableCollectionBug.MUTABLE_SET.add("External Modification"); // TRIGGER BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)  
        Set<String> modifiedSet = bugDemo.showBug();
        assertEquals(3, modifiedSet.size()); // This assertion will fail because the set is modified unexpectedly
    }
}