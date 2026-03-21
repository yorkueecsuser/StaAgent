import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        ArrayList<String> configuration = BugExample.showBug(); 
        configuration.add("setComparingPrivateFields(true)"); // BUG: AssertJ configuration should be applied
        // TRIGGER BUG: AssertJ configuration should be applied
    }
}