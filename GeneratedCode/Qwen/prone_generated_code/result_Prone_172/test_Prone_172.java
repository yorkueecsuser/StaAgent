import org.junit.Test;
import static org.junit.Assert.*;

public class UnusedAnonymousClassExampleTest {

    @Test
    public void testShowBug() {
        UnusedAnonymousClassExample example = new UnusedAnonymousClassExample();
        example.showBug(); // TRIGGER BUG: UnusedAnonymousClass
        fail("The test should fail because the Runnable is never executed."); // This will cause the test to fail
    }
}