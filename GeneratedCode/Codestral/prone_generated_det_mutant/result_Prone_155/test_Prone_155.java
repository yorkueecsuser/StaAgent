import org.junit.Test;
import static org.junit.Assert.*;

public class StreamToStringBugTest {
    @Test
    public void testShowBug() {
        StreamToStringBug bug = new StreamToStringBug();
        String result = bug.showBug(); // TRIGGER BUG: StreamToString
        assertNotEquals("java.util.stream.ReferencePipeline$Head@", result.substring(0, 36));
    }
}