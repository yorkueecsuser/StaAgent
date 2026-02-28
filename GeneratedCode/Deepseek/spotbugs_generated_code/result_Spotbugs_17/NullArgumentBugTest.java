import org.junit.Test;
import static org.junit.Assert.*;

public class NullArgumentBugTest {
    @Test
    public void showBugTriggerBug() {
        NullArgumentBug bug = new NullArgumentBug();
        bug.showBug(null); // TRIGGER BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }
}