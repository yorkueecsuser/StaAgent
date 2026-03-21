import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationTest {

    @Test
    public void testShowBug() {
        BugDemonstration demo = new BugDemonstration();
        demo.showBug(); // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    }
}