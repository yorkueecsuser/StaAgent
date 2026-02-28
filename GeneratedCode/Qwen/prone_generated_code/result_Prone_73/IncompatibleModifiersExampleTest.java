import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleModifiersExampleTest {

    @Test
    public void testShowBug() {
        // Triggering the bug by calling the static method annotated with @MyAnnotation
        IncompatibleModifiersExample.showBug(); // TRIGGER BUG: IncompatibleModifiers
    }
}