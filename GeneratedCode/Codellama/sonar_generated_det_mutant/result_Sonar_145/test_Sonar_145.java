import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyArrayTest {

    @Test
    public void testBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(numbers.toString(), "Hash code: [I@19821f"); // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
        assertEquals(numbers.toString(), "ToString: [I@19821f"); // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
    }
}