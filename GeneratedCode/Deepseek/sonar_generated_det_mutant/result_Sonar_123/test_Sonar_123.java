import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class InfiniteLoopTest {
    @Test
    public void showBugTest() {
        InfiniteLoop infiniteLoop = new InfiniteLoop();
        List<Integer> list = infiniteLoop.showBug(); // TRIGGER BUG: Loops should not be infinite
    }
}