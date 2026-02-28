import org.junit.Test;
import static org.junit.Assert.*;

public class NamesTest {

    @Test
    public void testShowBug() {
        Names names = new Names();
        names.showBug("TestName"); // TRIGGER BUG: GuardedBy
    }
}