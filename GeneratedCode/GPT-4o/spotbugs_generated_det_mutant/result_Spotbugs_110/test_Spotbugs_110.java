import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreExampleTest {

    @Test
    public void testShowBug() {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug(); // TRIGGER BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
        fail("The bug should have been triggered, but it was not."); // This line ensures the test fails
    }
}