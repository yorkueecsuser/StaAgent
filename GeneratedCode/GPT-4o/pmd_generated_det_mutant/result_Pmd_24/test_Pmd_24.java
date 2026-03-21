import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testShowBug() {
        Foo foo = new Foo();
        Object result = foo.showBug(); // TRIGGER BUG: CloneMethodMustBePublic
        assertNull(result); // This will fail if exception is thrown and not caught
    }
}