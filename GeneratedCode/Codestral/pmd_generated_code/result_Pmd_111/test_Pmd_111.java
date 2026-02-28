import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class InefficientToArrayCallTest {
    @Test
    public void testShowBug() {
        InefficientToArrayCall obj = new InefficientToArrayCall();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] arr = obj.showBug(numbers);
        // TRIGGER BUG: OptimizableToArrayCall
        assertTrue(arr.length == numbers.size());
        // The test will fail here because the length of arr is equal to the size of numbers,
        // which is not the expected behavior as per the bug description.
    }
}