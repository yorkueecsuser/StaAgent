import org.junit.Test;
import static org.junit.Assert.*;

public class CustomNumberTest {

    @Test
    public void testShowBug() {
        CustomNumber[] numbers = {
            new CustomNumber(3),
            new CustomNumber(1),
            new CustomNumber(2)
        };
        // Expecting [1, 2, 3] but will fail due to improper compareTo implementation
        int[] expected = {1, 2, 3};
        int[] result = CustomNumber.showBug(numbers); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
        assertArrayEquals(expected, result);
    }
}