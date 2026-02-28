import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionExampleTest {

    @Test
    public void testShowBugTriggersInfiniteRecursion() {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug(); // TRIGGER BUG: Recursion should not be infinite
    }
}