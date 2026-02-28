import org.junit.Test;
import static org.junit.Assert.*;

public class BoxedPrimitiveLockBugTest {
    private final BoxedPrimitiveLockBug bug = new BoxedPrimitiveLockBug();

    @Test // TRIGGER BUG: LockOnBoxedPrimitive
    public void testBug() {
        bug.showBug();
    }
}