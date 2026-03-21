import org.junit.Test;
import static org.junit.Assert.*;

public class UselessStringBugTest {

    @Test
    public void testShowBug() {
        UselessStringBug bug = new UselessStringBug();
        String result = bug.showBug();
        // TRIGGER BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        assertNotEquals("[1, 2, 3]", result);
    }
}