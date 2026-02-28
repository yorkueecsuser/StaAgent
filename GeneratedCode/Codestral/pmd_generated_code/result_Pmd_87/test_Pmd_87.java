import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testShowBug() {
        Foo foo = new Foo();
        foo.showBug();
        // TRIGGER BUG: UseProperClassLoader
        // The bug is triggered here because we are using Bar.class.getClassLoader() in a J2EE environment,
        // where it might not work as expected. The test will fail if this is the case.
    }
}