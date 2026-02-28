import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizerBugTest {

    @Test
    public void testRunFinalization() {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug(); // TRIGGER BUG: "runFinalizersOnExit" should not be called
    }
}