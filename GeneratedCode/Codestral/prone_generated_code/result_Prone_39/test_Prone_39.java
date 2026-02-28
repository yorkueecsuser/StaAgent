import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateMapKeysBugTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: DuplicateMapKeys
        assertThrows(IllegalArgumentException.class, () -> DuplicateMapKeysBug.showBug());
    }
}