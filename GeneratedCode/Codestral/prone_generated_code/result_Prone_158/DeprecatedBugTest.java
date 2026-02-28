import org.junit.Test;
import static org.junit.Assert.*;

public class DeprecatedBugTest {
    @Test
    // TRIGGER BUG: SuppressWarningsDeprecated
    public void testShowBug() {
        String input = DeprecatedBug.showBug();
        // Since the deprecated method is called and the SuppressWarnings annotation is incorrect,
        // this test will fail due to the warning being suppressed, causing a deprecation warning during compilation.
    }
}