import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class DoNotMockTest {
    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // TRIGGER BUG: DoNotMock
        numbers.add(6);
        System.out.println(numbers);
    }
}