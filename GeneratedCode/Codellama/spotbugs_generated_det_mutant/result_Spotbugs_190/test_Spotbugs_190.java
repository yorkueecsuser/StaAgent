import org.junit.Test;
import static org.junit.Assert.*;

public class MutableCollectionBugTest {
    @Test
    public void testBug() {
        MutableCollectionBug bug = new MutableCollectionBug();
        bug.showBug();
        assertEquals(2, bug. MY_SET.size()); // TRIGGER BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    }
}