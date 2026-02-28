import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceCleanerTest {

    @Test
    public void testShowBug() {
        ResourceCleaner cleaner = new ResourceCleaner();
        cleaner.showBug(); // TRIGGER BUG: EmptyFinalizer
        fail("The finalize method is empty and should be removed."); // This line ensures failure to demonstrate the bug
    }
}