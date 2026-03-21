import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class MainTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        assertTrue(Main.showBug()); // This should fail
    }
}