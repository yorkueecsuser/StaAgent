import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testShowBug() {
        Foo foo = new Foo();
        assertEquals("Logs have been printed using two different loggers.", foo.showBug()); // TRIGGER BUG: MoreThanOneLogger
    }
}