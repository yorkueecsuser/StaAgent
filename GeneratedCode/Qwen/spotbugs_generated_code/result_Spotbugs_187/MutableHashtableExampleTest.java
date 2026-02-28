import org.junit.Test;
import static org.junit.Assert.*;

public class MutableHashtableExampleTest {

    @Test
    public void testShowBugModifiesSharedHashtable() {
        MutableHashtableExample example = new MutableHashtableExample();
        assertEquals("value1", example.sharedHashtable.get("key1")); // Initial value check

        example.showBug("key1", "newValue1"); // TRIGGER BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
        assertEquals("newValue1", example.sharedHashtable.get("key1")); // This assertion will pass, but the bug is triggered by the modification

        example.showBug("key2", "newValue2"); // TRIGGER BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
        assertEquals("newValue2", example.sharedHashtable.get("key2")); // This assertion will pass, but the bug is triggered by the modification
    }
}