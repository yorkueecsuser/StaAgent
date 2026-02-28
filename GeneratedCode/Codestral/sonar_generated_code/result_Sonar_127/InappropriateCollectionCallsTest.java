import org.junit.Test;
import static org.junit.Assert.*;

public class InappropriateCollectionCallsTest {
    @Test
    public void testShowBug() {
        InappropriateCollectionCalls obj = new InappropriateCollectionCalls();
        Integer testInteger = 123;
        // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        assertFalse(obj.showBug(testInteger));
    }
}