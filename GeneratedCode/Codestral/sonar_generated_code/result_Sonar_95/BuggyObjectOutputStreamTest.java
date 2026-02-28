import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.List;

public class BuggyObjectOutputStreamTest {

    @Test
    public void testShowBug() throws IOException, ClassNotFoundException {
        BuggyObjectOutputStream buggyObjectOutputStream = new BuggyObjectOutputStream();
        List<String> readList = buggyObjectOutputStream.showBug(); // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        assertNotNull(readList);
        assertEquals(2, readList.size());
        assertEquals("First String", readList.get(0));
        assertEquals("Second String", readList.get(1));
    }
}