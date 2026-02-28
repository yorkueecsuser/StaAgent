import org.junit.Test;
import static org.junit.Assert.*;

public class NullArgumentForNonNullParameterTest {
    @Test
    public void testNullArgumentForNonNullParameter() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // TRIGGER BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        System.out.println(Arrays.toString(nullNumbers));
    }
}