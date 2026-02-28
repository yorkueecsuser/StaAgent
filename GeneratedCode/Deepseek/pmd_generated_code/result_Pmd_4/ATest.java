import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {
    A a = new A();

    @Test
    public void testShowBug() throws IllegalAccessException, NoSuchFieldException {
        // TRIGGER BUG: AvoidAssertAsIdentifier
        a.showBug();
    }
}