import org.junit.Test;
import static org.junit.Assert.*;

public class DontCallThreadRunTest {

    @Test
    public void testDontCallThreadRun() {
        DontCallThreadRun instance = new DontCallThreadRun();
        boolean result = instance.showBug();
        assertFalse(result); // TRIGGER BUG: DontCallThreadRun
    }
}