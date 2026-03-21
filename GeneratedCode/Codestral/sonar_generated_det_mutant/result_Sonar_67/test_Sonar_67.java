import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class IntermediateStreamBugTest {
    @Test
    public void testShowBug() {
        IntermediateStreamBug bug = new IntermediateStreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8);
        List<Integer> result = bug.showBug(numbers).collect(Collectors.toList());
        // TRIGGER BUG: Intermediate Stream methods should not be left unused
        // The bug is triggered because the filter operation is not used in the stream pipeline.
        // The expected result should only contain numbers greater than 5, but it contains all numbers.
        List<Integer> expected = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());
        assertEquals(expected, result);
    }
}