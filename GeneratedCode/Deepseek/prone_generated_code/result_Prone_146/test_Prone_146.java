import org.junit.Test;
import static org.junit.Assert.*;

public class RestrictedApiCheckerTest {

    @Test
    // TRIGGER BUG: RestrictedApi
    public void testRestrictedMethod() {
        RestrictedApiChecker.showBug(); // This line should trigger the bug
    }
}