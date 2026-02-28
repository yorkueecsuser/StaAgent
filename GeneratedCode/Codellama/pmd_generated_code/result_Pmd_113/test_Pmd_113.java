import org.junit.Test;
import static org.junit.Assert.*;

public class StringInstantiationBugTest {
    @Test
    public void testShowBug() {
        StringInstantiationBug buggyMethod = new StringInstantiationBug();
        buggyMethod.showBug();
        // TRIGGER BUG: StringInstantiation
    }
}