import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class BugExampleTest {

    @Test
    public void testShowBug() throws IOException {
        BugExample be = new BugExample();
        byte data;
        try {
            data = be.showBug("test.txt");
            fail("Should have thrown an IOException");
        } catch (IOException e) {
            // Expected exception, test passes
        }
    }

}