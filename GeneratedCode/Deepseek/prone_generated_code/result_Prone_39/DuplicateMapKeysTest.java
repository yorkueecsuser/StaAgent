import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateMapKeysTest {
    @Test
    public void testDuplicateMapKeys() {
        // This test case is designed to trigger the bug of duplicate keys in Map#ofEntries.
        // We will call the showBug method of the DuplicateMapKeys class.
        DuplicateMapKeys dmk = new DuplicateMapKeys();
        dmk.showBug(); // TRIGGER BUG: DuplicateMapKeys
    }
}