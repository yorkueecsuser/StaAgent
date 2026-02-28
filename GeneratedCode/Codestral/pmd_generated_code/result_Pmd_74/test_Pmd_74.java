import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    Foo testObj = new Foo();

    @Test
    public void testShowBug3() {
        // TRIGGER BUG: SuspiciousEqualsMethodName
        // The bug is triggered here because the equals method is called with two parameters, which does not exist.
        // Expected error: The method equals(Object, Object) is undefined for the type Foo
        assertFalse(testObj.showBug3(new Object(), new Object()));
    }
}