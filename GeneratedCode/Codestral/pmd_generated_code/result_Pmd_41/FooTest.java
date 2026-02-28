import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testEmptyFinalizer() {
        Foo foo = new Foo("Test message");
        foo.showBug(); // TRIGGER BUG: EmptyFinalizer
        // The bug is triggered when the garbage collector runs, which may not happen immediately.
        // To guarantee the bug is triggered, we can manually call the garbage collector, but it's not recommended in a real testing scenario.
        System.gc();
    }
}