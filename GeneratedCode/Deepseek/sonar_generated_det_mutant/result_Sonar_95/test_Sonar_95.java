import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class ObjectOutputStreamBugTest {

    private ObjectOutputStreamBug bug = new ObjectOutputStreamBug();

    @Test // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
    public void testShowBug() throws IOException {
        bug.showBug(); // Here we trigger the bug
    }
}