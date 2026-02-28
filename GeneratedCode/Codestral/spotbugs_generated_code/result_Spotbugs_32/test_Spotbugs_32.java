import org.junit.Test;
import static org.junit.Assert.*;

public class UninitializedFieldBugTest {
    @Test
    public void testShowBug() {
        UninitializedFieldBug bug = new UninitializedFieldBug(); // TRIGGER BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        bug.showBug();
    }
}