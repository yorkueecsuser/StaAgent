import org.junit.Test;
import static org.junit.Assert.*;

public class MutableCollectionBugTest {

    @Test
    public void testShowBug() {
        MutableCollectionBug bug = new MutableCollectionBug();
        bug.showBug();
        // TRIGGER BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
        assertEquals(3, MutableCollectionBug.COLLECTION.size());
    }
}