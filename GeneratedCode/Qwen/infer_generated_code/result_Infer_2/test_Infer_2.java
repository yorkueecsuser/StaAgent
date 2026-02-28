import org.junit.Test;
import static org.junit.Assert.*;

public class MemoryAllocatorTest {

    @Test
    public void testDirectlyAllocatingMethod() {
        MemoryAllocator allocator = new MemoryAllocator();
        allocator.showBug(); // TRIGGER BUG: CHECKERS_ALLOCATES_MEMORY
    }
}