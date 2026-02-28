import org.junit.Test;
import static org.junit.Assert.*;

public class ExternalizableBugTest {

    @Test
    public void showBugTest() throws Exception {
        ExternalizableBug buggyObject = new ExternalizableBug(10);
        int result = buggyObject.showBug();
        // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
    }
}