import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class BugExampleTest { // CLASS NAME MUST END WITH "Test"

    @Test // REQUIRED TEST ANNOTATION
    public void testShowBug() { // METHOD NAME MUST START WITH "test"
        assertFalse(BugExample.showBug()); // EXPECTING FALSE AS THE BUG IS TRIGGERED
        // TRIGGER BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }
}