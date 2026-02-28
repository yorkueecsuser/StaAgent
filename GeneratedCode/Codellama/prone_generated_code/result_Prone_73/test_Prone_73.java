import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class IncompatibleModifiersTest {
    @Test
    public void testIncompatibleModifiers() {
        IncompatibleModifiers im = new IncompatibleModifiers();
        im.showBug();
        // TRIGGER BUG: IncompatibleModifiers
        im.counter.incrementAndGet();
        assertEquals(1, im.counter.get());
    }
}