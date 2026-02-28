import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class StreamReadBugTest {
    @Test
    public void testDoSomething() throws IOException {
        StreamReadBug bug = new StreamReadBug();
        bug.showBug(); // TRIGGER BUG: The value returned from a stream read should be checked
    }
}