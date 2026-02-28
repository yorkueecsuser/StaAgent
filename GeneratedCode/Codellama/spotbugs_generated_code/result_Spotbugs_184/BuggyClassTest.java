import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testBug() {
        // TRIGGER BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
        String[] originalFruits = BuggyClass.fruits;
        BuggyClass.showBug();
        assertArrayEquals(new String[] {"mango", "pineapple", "strawberry"}, BuggyClass.fruits);
        BuggyClass.fruits = originalFruits;
    }
}