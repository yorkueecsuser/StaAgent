import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileExampleTest {

    @Test
    public void testIncrementSharedVariable() {
        VolatileExample example = new VolatileExample();
        example.showBug(); // TRIGGER BUG: AvoidUsingVolatile
        int finalValue = example.getSharedVariable();
        assertEquals(2000, finalValue); // This assertion will fail due to the race condition caused by the volatile keyword
    }
}