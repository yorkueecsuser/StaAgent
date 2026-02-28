import org.junit.Test;
import static org.junit.Assert.*;

public class PossibleNullPointerDereferenceTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        PossibleNullPointerDereference pnpd = new PossibleNullPointerDereference();
        try {
            pnpd.showBug();
        } catch (NullPointerException e) {
            System.out.println("Triggered null pointer dereference on exception path");
        }
    }
}