import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testBuggyMethod() {
        Foo foo = new Foo();
        assertTrue(foo.showBug());  // TRIGGER BUG: AvoidSynchronizedAtMethodLevel
    }
}