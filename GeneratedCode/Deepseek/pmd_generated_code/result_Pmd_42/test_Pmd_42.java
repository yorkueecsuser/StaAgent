import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {
    private EqualsNullBug bug = new EqualsNullBug();

    @Test
    public void testShowBugTriggersEqualsNullBug() {
        bug.showBug(); // TRIGGER BUG: EqualsNull
    }
}