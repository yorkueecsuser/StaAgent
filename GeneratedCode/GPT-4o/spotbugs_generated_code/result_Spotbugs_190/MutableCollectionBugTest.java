import org.junit.Test;
import static org.junit.Assert.*;

public class MutableCollectionBugTest {

    @Test
    public void testShowBug_ModifiesCollection() {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        bugDemo.showBug(); // TRIGGER BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)

        // Intentionally failing the test to demonstrate the bug
        assertFalse(MutableCollectionBug.ITEMS.contains("MaliciousItem"));
    }
}