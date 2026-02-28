import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationTest {
    @Test
    public void testShowBug() throws CloneNotSupportedException {
        BugDemonstration demo = new BugDemonstration();
        demo.showBug(); // TRIGGER BUG: CloneMethodMustImplementCloneable
    }
}