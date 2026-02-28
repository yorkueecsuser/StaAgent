import org.junit.Test;
import static org.junit.Assert.*;

public class DontCallThreadRunTest {
    @Test
    public void testShowBug() { // TRIGGER BUG: DontCallThreadRun
        DontCallThreadRun.showBug();
    }
}