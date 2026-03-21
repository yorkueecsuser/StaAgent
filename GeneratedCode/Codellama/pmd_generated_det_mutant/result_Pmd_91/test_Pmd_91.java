import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidUsingVolatileTest {

    @Test
    public void testBug() {
        AvoidUsingVolatile avo = new AvoidUsingVolatile();
        avo.incrementCounter();
        assertEquals(1, avo.getCounter()); // TRIGGER BUG: AvoidUsingVolatile
    }
}