import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionTest {
    @Test
    public void testShowBug() {
        InfiniteRecursion ir = new InfiniteRecursion();
        ir.showBug(1); // TRIGGER BUG: Recursion should not be infinite
    }
}