import org.junit.Test;
import static org.junit.Assert.*;

public class RandomModIntegerTest {

    RandomModInteger bug = new RandomModInteger();

    @Test
    // TRIGGER BUG: RandomModInteger
    public void testShowBug() {
        int result = bug.showBug();
        assertTrue(result >= 0 && result < 10);
    }
}