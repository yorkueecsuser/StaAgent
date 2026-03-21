import org.junit.Test;
import static org.junit.Assert.*;

public class RelativePathTraversalTest {
    @Test // TRIGGER BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    public void testShowBug() {
        RelativePathTraversal rpt = new RelativePathTraversal();
        rpt.showBug("..");
        // The test code should trigger a relative path traversal bug,
        // but it does not as the showBug method does not handle relative paths.
        // Hence, the test should fail.
    }
}