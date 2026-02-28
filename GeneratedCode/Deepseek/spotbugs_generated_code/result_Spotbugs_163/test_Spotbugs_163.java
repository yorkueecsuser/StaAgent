import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class AbsolutePathTraversalTest {

    @Test
    public void testShowBug() throws IOException {
        AbsolutePathTraversal app = new AbsolutePathTraversal();
        String fileName = "../../../etc/passwd";  // TRIGGER BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        // The test is expected to fail because the fileName parameter is manipulated
        // to access a file outside of the restricted directory.
        // If the bug is not fixed, the test will throw an IOException.
        app.showBug(fileName);
    }
}