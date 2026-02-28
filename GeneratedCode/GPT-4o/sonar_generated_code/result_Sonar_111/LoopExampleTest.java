import org.junit.Test;
import static org.junit.Assert.*;

public class LoopExampleTest {

    @Test
    public void testShowBug() {
        LoopExample example = new LoopExample();
        int result = example.showBug(); // TRIGGER BUG: Loop conditions should be true at least once
        assertEquals("The sum should be 45 when the loop is correctly executed from 0 to 9", 45, result);
    }
}