import org.junit.Test;
import static org.junit.Assert.*;

public class MutableCollectionBugTest {

    @Test
    public void testShowBug_ModifiesStaticList() {
        MutableCollectionBug bugInstance = new MutableCollectionBug();
        String result = bugInstance.showBug("New Value"); // TRIGGER BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
        assertEquals("Initial Value, New Value", result);
        
        // Creating another instance to demonstrate the bug
        MutableCollectionBug anotherBugInstance = new MutableCollectionBug();
        String secondResult = anotherBugInstance.showBug("Another Value"); // TRIGGER BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
        assertEquals("Initial Value, New Value, Another Value", secondResult); // This assertion will fail, demonstrating the bug
    }
}