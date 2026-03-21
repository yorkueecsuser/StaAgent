import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test // TRIGGER BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public void testShowBug() {
        String initialValue = Main.showBug();
        Main.addToBugCollection("New Value");
        String afterValue = Main.showBug();
        assertNotEquals(initialValue, afterValue); // Ensure that the value has been changed
    }
}