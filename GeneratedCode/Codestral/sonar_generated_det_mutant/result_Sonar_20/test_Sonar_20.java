import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionModificationBugTest {
    @Test
    public void testShowBug() {
        CollectionModificationBug.showBug(); // TRIGGER BUG: Calling the method that modifies the collection while iterating over it
    }
}