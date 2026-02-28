import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionTest {
    @Test
    public void testInfiniteRecursion() {
        InfiniteRecursion infiniteRecursion = new InfiniteRecursion();
        assertEquals(1, infiniteRecursion.oops()); // TRIGGER BUG: InfiniteRecursion
    }
}