import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class StreamBugTest {
    @Test
    public void testShowBug() {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        List<Integer> result = bug.showBug(numbers).collect(java.util.stream.Collectors.toList()); // TRIGGER BUG: Intermediate Stream methods should not be left unused
        assertEquals(expected, result);
    }
}