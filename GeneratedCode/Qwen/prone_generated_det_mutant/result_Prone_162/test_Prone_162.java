import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstratorTest {

    @Test
    public void testShowBug() {
        BugDemonstrator demonstrator = new BugDemonstrator();
        demonstrator.showBug(); // TRIGGER BUG: ThrowIfUncheckedKnownChecked
    }
}