import org.junit.Test;
import static org.junit.Assert.*;

public class LockOnBoxedPrimitiveExampleTest {

    @Test
    public void testLockOnBoxedPrimitive() {
        LockOnBoxedPrimitiveExample example = new LockOnBoxedPrimitiveExample();
        example.showBug(); // TRIGGER BUG: LockOnBoxedPrimitive
        fail("This test should fail due to the bug in LockOnBoxedPrimitiveExample"); // This assertion ensures the test fails
    }
}