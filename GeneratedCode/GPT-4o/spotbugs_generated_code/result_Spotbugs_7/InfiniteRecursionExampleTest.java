import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteRecursionExampleTest {

    @Test
    public void testShowBug() {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug(); // TRIGGER BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }
}