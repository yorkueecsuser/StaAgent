import org.junit.Test;
import static org.junit.Assert.*;

public class SessionBugExampleTest {

    @Test
    public void testShowBug() {
        SessionBugExample example = new SessionBugExample();
        example.showBug();  // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }
}