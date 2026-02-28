import org.junit.Test;
import static org.junit.Assert.*;

class AvoidSynchronizedAtMethodLevelTest {
    @Test
    public void testMethodWithSynchronizedBlock() {
        AvoidSynchronizedAtMethodLevel obj = new AvoidSynchronizedAtMethodLevel();
        obj.methodWithSynchronizedBlock();
        // TRIGGER BUG: AvoidSynchronizedAtMethodLevel
    }

    @Test
    public void testMethodWithoutSynchronizedBlock() {
        AvoidSynchronizedAtMethodLevel obj = new AvoidSynchronizedAtMethodLevel();
        obj.methodWithoutSynchronizedBlock();
        // TRIGGER BUG: AvoidSynchronizedAtMethodLevel
    }
}