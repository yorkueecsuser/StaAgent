import org.junit.Test;
import static org.junit.Assert.*;

public class BTest {

    @Test
    public void testShowBug() {
        B b = new B("Hello");
        Object result = b.showBug(); // TRIGGER BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
        assertNotNull(result);
    }
}