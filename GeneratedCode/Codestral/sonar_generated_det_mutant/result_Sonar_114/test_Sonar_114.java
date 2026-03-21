import org.junit.Test;
import static org.junit.Assert.*;

public class BuggySpringServiceTest {

    @Test(expected = IllegalStateException.class)
    public void testShowBug() {
        BuggySpringService service = new BuggySpringService();
        service.showBug(); // TRIGGER BUG: Methods with Spring proxying annotations should be public
    }
}