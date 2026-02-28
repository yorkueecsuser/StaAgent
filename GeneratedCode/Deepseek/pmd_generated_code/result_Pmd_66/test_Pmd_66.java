import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testProperLogger() {
        Foo foo = new Foo();
        foo.showBug();
        // TRIGGER BUG: ProperLogger
        // This line should trigger the bug
    }
}