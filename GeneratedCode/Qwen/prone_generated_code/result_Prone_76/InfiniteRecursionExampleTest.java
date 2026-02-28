import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionExampleTest {

    @Test
    public void testInfiniteRecursion() {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug(); // TRIGGER BUG: InfiniteRecursion
    }
}