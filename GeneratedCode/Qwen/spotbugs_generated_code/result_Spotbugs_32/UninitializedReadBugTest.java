import org.junit.Test;
import static org.junit.Assert.*;

public class UninitializedReadBugTest {

    @Test
    public void testUninitializedRead() {
        UninitializedReadBug bugDemo = new UninitializedReadBug(10); // TRIGGER BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        assertEquals(10, bugDemo.showBug());
    }
}