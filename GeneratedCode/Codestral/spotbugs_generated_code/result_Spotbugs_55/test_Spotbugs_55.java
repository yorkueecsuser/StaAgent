import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceBugTest {

    @Test
    public void testNullPointerDereferenceBug() {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug(); // TRIGGER BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }
}