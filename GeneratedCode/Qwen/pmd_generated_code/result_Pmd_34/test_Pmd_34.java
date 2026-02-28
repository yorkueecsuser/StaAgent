import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationTest {

    @Test
    public void testShowBug() {
        BugDemonstration demo = new BugDemonstration();
        assertEquals("This is a custom exception", demo.showBug()); // TRIGGER BUG: DoNotExtendJavaLangThrowable
    }
}