import org.junit.Test;
import static org.junit.Assert.*;

public class UninitializedReadBugTest {
    @Test
    public void testUninitializedReadBug() {
        UninitializedReadBug bug = new UninitializedReadBug();
        // This will trigger the bug because the uninitialized field 'value' is read
        bug.showBug();
    }
}