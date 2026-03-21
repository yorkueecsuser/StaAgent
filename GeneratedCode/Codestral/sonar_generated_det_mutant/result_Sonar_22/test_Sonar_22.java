import org.junit.Test;
import static org.junit.Assert.*;

public class UnsupportedCollectionOperationBugTest {
    @Test
    public void testShowBug() {
        UnsupportedCollectionOperationBug bug = new UnsupportedCollectionOperationBug();
        // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
        assertThrows(UnsupportedOperationException.class, () -> {
            bug.showBug();
        });
    }
}