import org.junit.Test;
import static org.junit.Assert.*;

public class MutableHashtableExampleTest {

    @Test
    public void testShowBug() {
        MutableHashtableExample example = new MutableHashtableExample();
        example.showBug(); // TRIGGER BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
        
        // The test checks if the value of "setting1" is still "value1", 
        // which it should not be after showBug is called.
        assertEquals("value1", MutableHashtableExample.configSettings.get("setting1")); // TRIGGER BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    }
}