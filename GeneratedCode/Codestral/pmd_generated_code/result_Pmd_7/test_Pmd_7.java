import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testShowBugWithNullInput() {
        Foo foo = new Foo();
        // TRIGGER BUG: AvoidCatchingNPE - Calling showBug with null input should trigger a NullPointerException
        String result = foo.showBug(null);
        assertNotNull("The result should not be null", result);
    }
}