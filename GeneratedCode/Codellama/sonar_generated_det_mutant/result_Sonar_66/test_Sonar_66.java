import org.junit.Test;
import static org.junit.Assert.*;
import java.util.stream.Stream;

public class StreamBugTest {
    @Test
    public void testBug() {
        Stream<Integer> pipeline = Stream.of(1, 2, 3, 4, 5);
        int sum1 = pipeline.sum();
        int sum2 = pipeline.mapToInt(i -> i * 2).sum(); // TRIGGER BUG: Consumed Stream pipelines should not be reused
        assertEquals(15, sum1);
        assertEquals(30, sum2);
    }
}