import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testShowBug() {
        Foo foo = new Foo();
        ClassLoader cl = foo.showBug(); // TRIGGER BUG: UseProperClassLoader
        assertNotNull(cl); // This assertion will fail, triggering the bug
    }
}