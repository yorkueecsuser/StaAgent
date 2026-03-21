import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyStreamReuseTest {
    @Test
    public void testShowBug() {
        BuggyStreamReuse.showBug();
        // The previous call to BuggyStreamReuse.showBug() will throw an IllegalStateException
        // because it tries to reuse the stream 'pipeline' after it has been consumed by the findAny() operation.
        // TRIGGER BUG: Consumed Stream pipelines should not be reused
    }
}