import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalOfRedundantMethodTest {
    @Test
    public void testBug() {
        OptionalOfRedundantMethod obj = new OptionalOfRedundantMethod();
        obj.showBug();
        // TRIGGER BUG: OptionalOfRedundantMethod
    }
}