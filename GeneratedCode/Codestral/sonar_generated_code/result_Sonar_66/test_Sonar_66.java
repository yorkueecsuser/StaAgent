import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class StreamBugTest {

    @Test
    public void testShowBug() {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10);
        int[] results = bug.showBug(numbers);

        // TRIGGER BUG: Consumed Stream pipelines should not be reused
        assertNotEquals(results[0], results[1]);  // The bug is triggered as the stream pipeline is reused
    }
}