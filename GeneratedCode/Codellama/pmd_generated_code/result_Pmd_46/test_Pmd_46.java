import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeShouldBeProtectedTest {
    @Test
    public void testBug() {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // TRIGGER BUG: FinalizeShouldBeProtected
    }
}