import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class StreamBugTest {
    @Test
    public void testShowBug() {
        StreamBug bug = new StreamBug();
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int[] results = bug.showBug(nums);
        int expectedSum1 = nums.stream().filter(n -> n > 0).mapToInt(Integer::intValue).sum();
        int expectedSum2 = nums.stream().filter(n -> n > 0).map(n -> n * 2).mapToInt(Integer::intValue).sum();
        assertEquals("First sum is incorrect", expectedSum1, results[0]);
        assertEquals("Second sum is incorrect", expectedSum2, results[1]); // TRIGGER BUG: Consumed Stream pipelines should not be reused
    }
}