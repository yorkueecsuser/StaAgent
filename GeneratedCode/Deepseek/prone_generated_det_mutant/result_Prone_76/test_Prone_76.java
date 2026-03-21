import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionTest {
    @Test
    public void testInfiniteRecursion() {
        // TRIGGER BUG: InfiniteRecursion
        oops();
    }

    public int oops() {
        return oops(); // This line will cause a StackOverflowError
    }
}