import org.junit.Test;
import static org.junit.Assert.*;

public class MockitoArgumentMatchersExampleTest {

    @Test
    public void testShowBug() {
        MockitoArgumentMatchersExample.showBug(); // TRIGGER BUG: Mockito argument matchers should be used on all parameters
    }
}