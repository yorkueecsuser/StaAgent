import org.junit.Test;
import static org.junit.Assert.*;

public class JumbledIncrementerTest {
    @Test
    public void testJumbledIncrementer() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // TRIGGER BUG: JumbledIncrementer
        }
        assertEquals(15, sum);
    }

    @Test
    public void testJumbledIncrementer2() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // TRIGGER BUG: JumbledIncrementer
        }
        assertEquals(20, sum);
    }
}