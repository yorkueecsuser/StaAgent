import org.junit.Test;
import static org.junit.Assert.*;

public class GuiceInjectExampleTest {

    @Test
    public void testShowBug() {
        GuiceInjectExample example = new GuiceInjectExample(42);
        example.showBug(); // TRIGGER BUG: GuiceInjectOnFinalField
        fail("Expected bug to be triggered due to final field injection."); // TRIGGER BUG: GuiceInjectOnFinalField
    }
}