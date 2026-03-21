import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testShowBug() {
        Foo.showBug(); // TRIGGER BUG: MissingStaticMethodInNonInstantiatableClass
    }
}