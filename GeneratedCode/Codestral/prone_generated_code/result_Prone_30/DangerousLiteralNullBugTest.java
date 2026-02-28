import org.junit.Test;
import static org.junit.Assert.*;

public class DangerousLiteralNullBugTest {
    @Test
    public void testUnsafeMethodWithNull() {
        // TRIGGER BUG: DangerousLiteralNull
        DangerousLiteralNullBug.showBug();
    }
}