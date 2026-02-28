import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CollectionBugTest {
    CollectionBug cb = new CollectionBug();

    @Test
    public void testShowBug() {
        try {
            cb.showBug();
            fail(); // TRIGGER BUG: ModifyingCollectionWithItself
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }
}