import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class BuggyActivityTest {
    @Test
    public void testOnCreate() {
        BuggyActivity activity = new BuggyActivity();
        ArrayList<String> bundle = new ArrayList<>();
        activity.showBug(bundle); // TRIGGER BUG: CallSuperFirst
    }
}