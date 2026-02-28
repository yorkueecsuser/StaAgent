import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceTest {
    @Test
    public void testShowBug() {
        NullPointerDereference npd = new NullPointerDereference();
        npd.showBug(); // TRIGGER BUG: Null pointers should not be dereferenced
    }
}