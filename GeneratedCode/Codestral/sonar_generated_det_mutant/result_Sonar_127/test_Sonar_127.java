import org.junit.Test;
import static org.junit.Assert.*;

public class InappropriateCollectionCallsTest {
    @Test
    public void testShowBug() {
        InappropriateCollectionCalls instance = new InappropriateCollectionCalls();
        Boolean result = instance.showBug(1); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        assertFalse(result);
    }
}