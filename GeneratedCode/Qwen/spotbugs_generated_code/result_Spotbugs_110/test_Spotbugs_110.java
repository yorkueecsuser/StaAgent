import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreExampleTest {

    @Test
    public void testShowBug() {
        DeadStoreExample example = new DeadStoreExample();
        Class<?> result = example.showBug(); // TRIGGER BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 
        assertNotNull(result); // This assertion will fail because showBug returns null
    }
}