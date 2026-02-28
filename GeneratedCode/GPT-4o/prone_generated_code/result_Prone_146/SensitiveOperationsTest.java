import org.junit.Test;
import static org.junit.Assert.*;

public class RestrictedApiDemoTest {

    @Test
    public void testShowBug() {
        RestrictedApiDemo demo = new RestrictedApiDemo();
        String result = demo.showBug(); // TRIGGER BUG: RestrictedApi
        assertEquals("Sensitive operation executed without allowlist.", result);
    }
}