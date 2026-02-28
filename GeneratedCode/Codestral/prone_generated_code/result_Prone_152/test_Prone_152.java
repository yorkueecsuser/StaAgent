import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBugTest {

    @Test
    public void showBugTest() {
        ProtoBug bug = new ProtoBug();
        bug.showBug();  // TRIGGER BUG: SetUnrecognized
    }
}