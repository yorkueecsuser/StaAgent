import org.junit.Test;
import static org.junit.Assert.*;

public class MemoryAllocationExampleTest {

    @Test
    public void testShowBug() {
        MemoryAllocationExample example = new MemoryAllocationExample();
        example.showBug(); // TRIGGER BUG: CHECKERS_ALLOCATES_MEMORY
    }
}