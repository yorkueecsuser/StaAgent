import org.junit.Test;
import static org.junit.Assert.*;

public class RestrictedApiBugTest {

    @Test
    public void testTriggerBug() {
        RestrictedApiBug instance = new RestrictedApiBug();
        instance.showBug(); // TRIGGER BUG: RestrictedApi
    }
}