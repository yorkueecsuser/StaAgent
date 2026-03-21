import static org.junit.Assert.*;
import org.junit.Test;

public class MutableCollectionBugExampleTest {

    @Test
    public void testMutableListModification() {
        MutableCollectionBugExample example = new MutableCollectionBugExample();
        example.showBug("Test Value 1"); // TRIGGER BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
        
        // Expecting mutableList to contain only "Initial Value" and "Test Value 1"
        assertEquals(2, example.mutableList.size());
        assertEquals("Initial Value", example.mutableList.get(0));
        assertEquals("Test Value 1", example.mutableList.get(1));
        
        example.showBug("Test Value 2"); // TRIGGER BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

        // Expecting mutableList to contain "Initial Value", "Test Value 1", and "Test Value 2"
        assertEquals(3, example.mutableList.size());
        assertEquals("Test Value 2", example.mutableList.get(2));
    }
}