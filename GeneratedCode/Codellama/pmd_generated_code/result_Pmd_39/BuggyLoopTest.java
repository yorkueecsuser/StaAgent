import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyLoopTest {
    @Test
    public void testBuggyLoop() {
        // TRIGGER BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    }
}