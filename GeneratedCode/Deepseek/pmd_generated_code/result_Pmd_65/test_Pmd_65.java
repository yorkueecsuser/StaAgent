import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    // TRIGGER BUG: ProperCloneImplementation
    public void testShowBug() {
        Foo foo = new Foo();
        Foo clonedFoo = (Foo) foo.showBug();
        assertNotSame(foo, clonedFoo);
    }
}