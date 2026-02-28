import org.junit.Test;
import static org.junit.Assert.*;

public class NullDereferenceBugTest {

    @Test
    public void testShowBug() {
        NullDereferenceBug bugInstance = new NullDereferenceBug();
        bugInstance.showBug(); // TRIGGER BUG: NULL_DEREFERENCE
        // The test will fail if getHelper returns null, causing a NullPointerException when attempting to call doSomething().
    }
}