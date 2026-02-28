import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testShowBug() {
        Foo foo = new Foo();
        // TRIGGER BUG: ProperLogger
        // This line will trigger the bug as it is trying to access a protected logger from another class
        foo.LOG.warning("This is a test warning log");
    }
}