import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ComputeIfAbsentBugExampleTest {

    @Test
    public void testShowBug() {
        ComputeIfAbsentBugExample example = new ComputeIfAbsentBugExample();
        
        long result1 = example.showBug(5L); // TRIGGER BUG: ComputeIfAbsentAmbiguousReference
        assertEquals(1, result1); // This will fail because result1 will be 6, not 1

        long result2 = example.showBug(5L); // TRIGGER BUG: ComputeIfAbsentAmbiguousReference
        assertEquals(2, result2); // This will fail because result2 will be 7, not 2
    }
}