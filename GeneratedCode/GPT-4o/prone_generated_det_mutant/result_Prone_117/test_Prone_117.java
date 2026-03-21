import org.junit.Test;
import static org.junit.Assert.*;

public class RandomNumberGeneratorTest {

    @Test
    public void testShowBug() {
        DemonstrateBug demo = new DemonstrateBug();
        int result = demo.showBug(); // TRIGGER BUG: NoCanIgnoreReturnValueOnClasses
        assertEquals("The random number should be between 0 and 99", result, -1);
    }
}