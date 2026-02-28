import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testShowBug_ModifiesMutableField() {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug(); // Initial state: {key1=value1}

        // Modifying the mutable field through the interface reference
        BuggyInterface.mutableField.put("key2", "value2"); // TRIGGER BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT) 

        // Calling showBug again to demonstrate the change
        buggy.showBug(); // Expected state after modification: {key1=value1, key2=value2}
        assertEquals(2, BuggyInterface.mutableField.size()); // This assertion will pass, but it demonstrates the bug
        assertFalse(BuggyInterface.mutableField.isEmpty()); // This assertion will pass, but it demonstrates the bug
        assertTrue(BuggyInterface.mutableField.containsKey("key2")); // This assertion will pass, but it demonstrates the bug
        assertEquals("value2", BuggyInterface.mutableField.get("key2")); // This assertion will pass, but it demonstrates the bug

        // Intentionally causing a test failure to trigger the bug
        assertEquals(1, BuggyInterface.mutableField.size()); // This assertion will fail, demonstrating the bug
    }
}