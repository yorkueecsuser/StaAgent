import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: BadAnnotationImplementation
        assertFalse(Foo.showBug());
    }
}