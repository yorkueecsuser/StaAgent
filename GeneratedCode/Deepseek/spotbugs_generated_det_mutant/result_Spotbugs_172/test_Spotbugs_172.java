import org.junit.Test;
import static org.junit.Assert.*;

public class ClassloaderBugExampleTest {
    // Junit test case to trigger the bug and fail
    @Test
    public void testShowBug() {
        ClassloaderBugExample bugExample = new ClassloaderBugExample();
        assertNotNull(bugExample.showBug()); // Will fail because URLClassLoader is being created outside doPrivileged block
    }
}