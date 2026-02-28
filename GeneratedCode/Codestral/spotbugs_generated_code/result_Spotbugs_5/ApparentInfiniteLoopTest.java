import org.junit.Test;
import static org.junit.Assert.*;

public class ApparentInfiniteLoopTest {
    @Test(timeout = 1000)
    public void showBugTest() {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug(); // TRIGGER BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
    }
}