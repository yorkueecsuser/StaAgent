import org.junit.Test;
import static org.junit.Assert.*;

public class MutableHashtableBugTest {
    @Test
    public void testMutableHashtableBug() {
        // Modifying the Hashtable from another class to trigger the bug
        // TRIGGER BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
        MutableHashtableBug.BUGGY_HASHTABLE.put("key1", "modifiedValue");

        // Verifying that the Hashtable has been modified
        assertEquals("modifiedValue", MutableHashtableBug.showBug("key1", "newValue"));
    }
}