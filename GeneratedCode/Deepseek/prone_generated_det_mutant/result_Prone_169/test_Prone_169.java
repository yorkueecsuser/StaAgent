import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryCheckNotNullBugTest {

    @Test
    public void testShowBug() {
        UnnecessaryCheckNotNullBug bug = new UnnecessaryCheckNotNullBug();
        bug.showBug(null); // TRIGGER BUG: UnnecessaryCheckNotNull
    }
}