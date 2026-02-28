import org.junit.Test;
import static org.junit.Assert.*;

public class MissingSuperCallBugTest {
    @Test
    public void testMissingSuperCall() {
        MissingSuperCallBug bug = new MissingSuperCallBug();
        bug.showBug(); // TRIGGER BUG: MissingSuperCall
    }
}