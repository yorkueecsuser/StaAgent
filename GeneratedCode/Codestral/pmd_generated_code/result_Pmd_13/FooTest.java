import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testShowBug() {
        Foo fooInstance = new Foo();
        // TRIGGER BUG: AvoidFieldNameMatchingTypeName
        assertEquals("Expecting foo to be a meaningful value, but it matches the class name.", 0, fooInstance.foo);
        fooInstance.showBug(); // This line will print '0' due to the uninitialized field 'foo'
    }
}