import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullParameterBugTest {

    @Test
    public void testShowBug() {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug(); // TRIGGER BUG: NullArgumentForNonNullParameter
    }
}