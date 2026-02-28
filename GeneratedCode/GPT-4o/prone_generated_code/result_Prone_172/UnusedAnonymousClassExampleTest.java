import org.junit.Test;
import static org.junit.Assert.*;

public class UnusedAnonymousClassExampleTest {

    @Test
    public void testShowBug() {
        UnusedAnonymousClassExample example = new UnusedAnonymousClassExample();
        example.showBug(); // TRIGGER BUG: UnusedAnonymousClass
        fail("The bug should have been triggered."); // Intentionally fails to indicate the bug presence
    }
}