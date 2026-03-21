import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class StreamBugTest {

    StreamBug bugDemo = new StreamBug();

    @Test
    // TRIGGER BUG: Consumed Stream pipelines should not be reused
    public void testShowBug() {
        List<Integer> results = bugDemo.showBug();
        assertEquals(2, results.size());
    }
}