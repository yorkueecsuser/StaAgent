import org.junit.Test;
import static org.junit.Assert.*;

public class MutableHashtableBugTest {
    @Test
    public void testShowBug() {
        MutableHashtableBug bug = new MutableHashtableBug();
        assertNotNull(bug.showBug());
        bug.showBug().put("four", 4); // TRIGGER BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
        assertEquals(4, bug.showBug().size()); // This will fail as the Hashtable size should be 3
    }
}