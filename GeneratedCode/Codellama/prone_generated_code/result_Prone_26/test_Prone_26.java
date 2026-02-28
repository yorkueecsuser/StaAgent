import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReferenceTest {
    @Test
    public void testComputeIfAbsentAmbiguousReference() {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        assertEquals("Should not trigger the bug", someLong + 1, atomicLong.get());
    }

    @Test
    public void testComputeIfAbsentAmbiguousReferenceWithZero() {
        long someLong = 0;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        assertEquals("Should not trigger the bug", someLong + 1, atomicLong.get());
    }

    @Test
    public void testComputeIfAbsentAmbiguousReferenceWithNegative() {
        long someLong = -123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        assertEquals("Should not trigger the bug", someLong + 1, atomicLong.get());
    }
}