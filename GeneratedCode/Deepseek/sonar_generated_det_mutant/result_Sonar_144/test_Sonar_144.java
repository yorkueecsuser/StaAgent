import org.junit.Test;
import java.io.*;

import static org.junit.Assert.*;

public class BugDemoTest {
    @Test(expected = NotSerializableException.class)
    public void testShowBug() throws IOException {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}