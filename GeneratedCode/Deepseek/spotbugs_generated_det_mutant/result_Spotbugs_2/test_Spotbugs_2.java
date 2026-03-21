import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.*;

public class OptionalReturnNullBugTest {

    @Test
    public void testShowBug() {
        OptionalReturnNullBug bug = new OptionalReturnNullBug();
        Optional<String> result = bug.showBug();
        // TRIGGER BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        assertNotNull(result); // This will fail since showBug() returns null
    }
}