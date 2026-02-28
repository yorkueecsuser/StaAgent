import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class CompatibleWithExampleTest {
    @Test
    public void testContainsAsT() {
        List<Number> numbers = Arrays.asList(1, 2.0, 3.0f);
        assertTrue(containsAsT(numbers, 2)); // TRIGGER BUG: IncompatibleArgumentType
    }

    @Test
    public void testContainsAsT_withObject() {
        List<String> strings = Arrays.asList("a", "b", "c");
        assertTrue(containsAsT(strings, new Object())); // TRIGGER BUG: IncompatibleArgumentType
    }
}