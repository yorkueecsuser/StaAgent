import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionBugTest {
    InfiniteRecursionBug instance = new InfiniteRecursionBug();

    @Test
    public void testShowBug() {
        instance.showBug(); // TRIGGER BUG: Recursion should not be infinite
    }
}