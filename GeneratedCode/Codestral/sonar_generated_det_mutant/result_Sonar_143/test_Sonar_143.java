import org.junit.Test;
import static org.junit.Assert.*;

public class RandomBugTest {
    @Test
    public void testRandomBug() {
        RandomBug bug = new RandomBug();
        int number1 = bug.getRandomNumber();
        int number2 = bug.getRandomNumber();
        assertNotEquals(number1, number2); // TRIGGER BUG: "Random" objects should be reused
    }
}