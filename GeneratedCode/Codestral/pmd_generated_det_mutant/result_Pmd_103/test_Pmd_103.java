import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class FileStreamBugTest {
    @Test
    public void testShowBug() throws IOException {
        FileStreamBug bugObj = new FileStreamBug();
        bugObj.showBug(); // TRIGGER BUG: AvoidFileStream
        fail("Expected IOException due to the use of FileReader which causes garbage collection pauses.");
    }
}