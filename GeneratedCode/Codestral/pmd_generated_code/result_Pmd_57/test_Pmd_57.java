import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testShowBug() {
        // TRIGGER BUG: MissingStaticMethodInNonInstantiatableClass
        Foo.showBug();
    }
}