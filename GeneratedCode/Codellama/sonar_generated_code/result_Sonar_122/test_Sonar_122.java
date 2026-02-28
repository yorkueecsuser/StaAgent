import org.junit.Test;
import static org.junit.Assert.*;

class InfiniteRecursionTest {
    @Test
    public void testInfiniteRecursion() {
        InfiniteRecursion ir = new InfiniteRecursion();
        ir.showBug();
    }
}