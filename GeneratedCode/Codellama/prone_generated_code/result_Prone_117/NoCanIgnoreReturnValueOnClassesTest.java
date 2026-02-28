import org.junit.Test;
import static org.junit.Assert.*;

public class NoCanIgnoreReturnValueOnClassesTest {
    @Test
    public void testShowBug() {
        NoCanIgnoreReturnValueOnClasses obj = new NoCanIgnoreReturnValueOnClasses();
        obj.showBug(); // TRIGGER BUG: NoCanIgnoreReturnValueOnClasses
    }
}