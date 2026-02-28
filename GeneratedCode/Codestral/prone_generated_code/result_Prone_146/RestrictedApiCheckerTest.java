import org.junit.Test;
import static org.junit.Assert.*;

public class RestrictedApiBugTest {

    @Test
    public void triggerRestrictedApiBug() {
        RestrictedApiBug bug = new RestrictedApiBug();
        assertEquals("Restricted method accessed", bug.showBug()); // TRIGGER BUG: RestrictedApi
    }
}