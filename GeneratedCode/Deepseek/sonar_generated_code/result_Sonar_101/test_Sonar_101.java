import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample(); // Non-standard import for testing purposes

    @Test
    public void testShowBug() {
        bugExample.showBug();
        // No assertion expected since the code will not execute, hence no exception will be thrown
    }

    @Test
    public void testShowBug2() {
        bugExample.showBug2();
        // No assertion expected since the code will not execute, hence no exception will be thrown
    }

    @Test
    public void testShowBug3() {
        bugExample.showBug3();
        // No assertion expected since the code will not execute, hence no exception will be thrown
    }

    @Test
    public void testShowBug4() {
        bugExample.showBug4();
        // No assertion expected since the code will not execute, hence no exception will be thrown
    }
    // TRIGGER BUG: Conditionally executed code should be reachable
}