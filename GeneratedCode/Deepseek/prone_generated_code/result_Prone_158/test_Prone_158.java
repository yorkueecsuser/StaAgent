import org.junit.Test;
import static org.junit.Assert.*;

public class SuppressWarningsDeprecatedBugTest {

    @Test
    public void triggerBug() {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug(); // This line triggers the bug
    }
}